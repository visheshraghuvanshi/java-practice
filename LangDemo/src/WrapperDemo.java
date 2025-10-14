import java.lang.*;
public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte c = 15;
        Byte d = Byte.valueOf("15"); //will convert it to byte
        byte bb = 15;
        Byte e = Byte.valueOf(bb); // error if directly assigned (because that is int)

        Short f = Short.valueOf("123");

        Float g = 12.3f;
        Float h = Float.valueOf("123.5");
        float x = h.floatValue();
        float y = h;

        Double j = Double.valueOf(123.456);

        Character k = Character.valueOf('A'); //Can't use Double Quotes

        Boolean l = Boolean.valueOf("true");
        Boolean m = Boolean.valueOf(false);

        System.out.printf("%d %d %d %d %d %d %d %d %f %f %f %f %f %c %b %b\n",  i, a, b, c, d, bb, e, f, g, h, x, y, j, k, l, m);

    }
}
