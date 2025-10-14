public class IntegerDemo {
    public static void main(String[] args) {
        int m1 = 15;

        Integer  m2 = m1;
        Integer m3 = 15;

        System.out.println(m2.equals(m1)); // Allowed
        System.out.println(m2.equals(m3));

        m2 = Integer.valueOf("123");
        m3 = Integer.valueOf("1010", 2); //in binary

        System.out.println(Integer.reverseBytes(m3));

        m3 = Integer.valueOf("A7", 16); //HexDecimal

        System.out.println(m3);

        Integer m4 = Integer.decode("0xA7");
        System.out.println(m4);

        System.out.println(Integer.parseInt("123"));
    }
}
