
public class Main {
    public static void main(String[] args) {
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 1 ; j <= 5 ; j++) {
                if (i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 1 ; j <= 5 ; j++) {
                if (5 - i + 1 <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //         *
        //       * * *
        //     * * * * *
        //   * * * * * * *
        // * * * * * * * * *
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 1 ; j < 5*2 ; j++) {
                if (5 - i + 1 <= j && j - i < 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}