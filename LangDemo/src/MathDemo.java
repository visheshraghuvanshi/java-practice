public class MathDemo {
    public static void main(String[] args) {
        System.out.print("Absolute of -123 : ");
        System.out.println(Math.abs(-123));

        System.out.print("Absolute of -123 : ");
        System.out.println(StrictMath.abs(-123));

        System.out.print("Cube Root of 27 : ");
        System.out.println(Math.cbrt(27));

        System.out.print("Exact Decrement of 7 : ");
        System.out.println(Math.decrementExact(7));  //what if we give minimum integer

        System.out.print("Exponent value in Floating Point Rep. 12.3456 : ");
        System.out.println(Math.getExponent(12.3459));

        System.out.print("Convert to Radians (90) : ");
        System.out.println(Math.toRadians(90));

        System.out.print("Round Division (50,9) : ");
        System.out.println(Math.floorDiv(50,9));

        System.out.print("e power x (1) : ");
        System.out.println(Math.exp(1));

        System.out.print("e power x (1) : ");
        System.out.println(StrictMath.exp(1));

        System.out.print("Log base 10 of 100 : ");
        System.out.println(Math.log10(100));

        System.out.print("Maximum of 100 and 50 : ");
        System.out.println(Math.max(100,50));

        System.out.print("Tan of 45 degree: ");
        System.out.println(Math.tan(45* Math.PI/180));

        System.out.print("Convert to Radians (90degree) : ");
        System.out.println(Math.toRadians(90));

        System.out.print("Convert to Degree tanh(1) : ");
        System.out.println(Math.toDegrees(Math.tanh(1)));

        System.out.print("Convert to Degrees tanh(1) : ");
        System.out.println(Math.toDegrees(StrictMath.tanh(1)));

        System.out.print("Random Number : ");
        System.out.println(Math.random()*1000); //3dig

        System.out.print("Power(2, 3) : ");
        System.out.println(Math.pow(2, 3));

        System.out.print("Exact Product (100, 200) : ");
        System.out.println(Math.multiplyExact(100, 200));

        System.out.print("Next Float Value (12.5, 13) : ");
        System.out.println(Math.nextAfter(12.5, 13));
    }
}
