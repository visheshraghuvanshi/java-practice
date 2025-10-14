
enum Dept {
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");

    String head;
    String location;

    private Dept(String head, String loc) {
        this.head = head;
        this.location = loc;
    }
    public String getheadName() {
        return head;
    }
    public String getLocation() {
        return location;
    }

//    public void display() {
//        System.out.println(this.name() + " " +this.ordinal());
//    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Dept d = Dept.ECE;
        System.out.println(d.getheadName());
        System.out.println(d.getLocation());



//        d.display();



//        switch(d) {
//            case CS:
//                System.out.println("Head: John\nBlock: A");
//                break;
//            case IT:
//                System.out.println("Head: Smith\nBlock: B");
//                break;
//            case CIVIL:
//                System.out.println("Head: Srinivas\nBlock: C");
//                break;
//            case ECE:
//                System.out.println("Head: Dave\nBlock: D");
//                break;
//        }
    }
}
