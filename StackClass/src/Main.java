class StackOverFlow extends Exception {
    public String toString() {
        return "Stack is Full";
    }
}
class StackUndeFlow extends Exception {
    public String toString() {
        return "Stack is Empty";
    }
}
class Stack {
    private int size;
    private int top = -1;
    private int S[];

    public Stack (int s) {
        size = s;
        S = new int[s];
    }
    public void push (int x) throws StackOverFlow {
        if (top == size - 1) {
            throw new StackOverFlow();
        }
        top++;
        S[top] = x;
    }
    public int pop() throws StackUndeFlow {
        int x = -1;

        if (top == -1) {
            throw new StackUndeFlow();
        }
        x = S[top];
        top --;
        return x;
    }
}

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack(5);

        try {
            st.push(10);
            st.push(15);
            st.push(10);
            st.push(15);
            st.push(10);

            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            System.out.println(st.pop());
        } catch (StackOverFlow s) {
            System.out.println(s);
        } catch (StackUndeFlow s) {
            System.out.println(s);
        }

    }
}