public class GeneralisationUsingObjectClass {
    public static void main(String[] args) {
        Object[] obj = new Object[3];

        obj[0] = "Hi";
        obj[1] = "Bye";
        obj[2] = 10; // Will give Exception at Runtime

        String str;

        for(Object o: obj) {
            try {
                str = (String) o;
                System.out.println(str);
            } catch (ClassCastException c) {
                System.out.println("Not a String - " + c);
            }
        }
    }
}
