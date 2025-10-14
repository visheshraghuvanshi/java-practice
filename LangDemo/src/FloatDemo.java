public class FloatDemo {
    public static void main(String[] args) {
        float a = 12.5f;
        Float b = 12.5f;

        System.out.println(b.equals(a));
        b = b / 0 ;
        System.out.println("Is Infinite? " + b.isInfinite());
        System.out.println("Is Positive Infinite? " + (b == Float.POSITIVE_INFINITY));
        b = -b;
        System.out.println("Is Negative Infinite? " + (b == Float.NEGATIVE_INFINITY));

        b = (float)Math.sqrt(-1);
        System.out.println("Is NaN ?: " + b.isNaN());

    }
}
