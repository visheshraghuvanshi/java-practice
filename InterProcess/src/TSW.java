// Teacher writes on WhiteBoard - Student copies - Teacher writes next Line
class WhiteBoard {
    private String text;
    private int studentCount = 0;
    private int copiedCount = 0;
    private boolean newContentAvailable = false;
    private int lineNumber = 0;

    public void setStudentCount(int count) {
        this.studentCount = count;
    }

    public synchronized void write(String msg, int lineNo) {
        while (newContentAvailable) {
            try { wait(); } catch (InterruptedException e) {}
        }
        text = msg;
        lineNumber = lineNo;
        System.out.println("Teacher writes: " + msg);
        copiedCount = 0;
        newContentAvailable = true;
        notifyAll();
        while (copiedCount < studentCount) {
            try { wait(); } catch (InterruptedException e) {}
        }
        newContentAvailable = false;
        notifyAll();
    }

    public synchronized void copy(int studentId, int lineNo) {
        while (!newContentAvailable || lineNo != lineNumber) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Student " + studentId + " copies: " + text);
        copiedCount++;
        if (copiedCount == studentCount) {
            notifyAll();
        }
    }
}

class Teacher extends Thread {
    WhiteBoard wb;
    String[] content;
    public Teacher(WhiteBoard wb, String[] content) {
        this.wb = wb;
        this.content = content;
    }
    public void run() {
        for (int i = 0; i < content.length; i++) {
            wb.write(content[i], i);
        }
    }
}

class Student extends Thread {
    WhiteBoard wb;
    int studentId;
    int numLines;
    public Student(WhiteBoard wb, int studentId, int numLines) {
        this.wb = wb;
        this.studentId = studentId;
        this.numLines = numLines;
    }
    public void run() {
        for (int i = 0; i < numLines; ++i) {
            wb.copy(studentId, i);
        }
    }
}

public class TSW {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        String[] content = {
                "Java is a language",
                "It is OOP's",
                "It supports MultiThreading",
                "End"
        };
        int studentNum = 4;
        wb.setStudentCount(studentNum);

        Teacher t = new Teacher(wb, content);
        Student[] students = new Student[studentNum];
        for (int i = 0; i < studentNum; i++) {
            students[i] = new Student(wb, i + 1, content.length);
        }

        t.start();
        for (Student s : students) s.start();
    }
}
