public class Main {
    public static void main(String[] args) {
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 1 ; j <= 5 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
//
//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
//        5 5 5 5 5
        System.out.println();
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 1 ; j <= 5 ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
//        2 3 4 5 6
//        3 4 5 6 7
//        4 5 6 7 8
//        5 6 7 8 9
//        6 7 8 9 10
        System.out.println();
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 1 ; j <= 5 ; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

//        1 2 3 4 5
//        6 7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25
        System.out.println();
        int count = 0;
        for (int i = 1 ; i <= 5 ; i++) {
            for (int j = 1 ; j <= 5 ; j++) {
                count += 1;
                System.out.format("%02d ",count);
            }
            System.out.println();
        }
    }
}