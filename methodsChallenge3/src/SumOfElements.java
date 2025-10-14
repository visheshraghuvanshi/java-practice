public class SumOfElements {

    static int sum (int ...x) {
        int sum = 0;
        for (int i: x) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1,2,3,4,5,6 is " + sum(1,2,3,4,5,6));
    }
}