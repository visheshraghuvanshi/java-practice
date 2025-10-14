public class MaximumNumber {

    static int max (int ...x) {
        int max = x[0];
        for (int i: x) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum of 1,2,3,4,5,6 is " + max(1,2,3,4,5,6));
    }
}