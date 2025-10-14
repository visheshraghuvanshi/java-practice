
public class Main {
    public static void main(String[] args) {
        int[][] k = new int[5][5];
        int B[][] = {{1,2,3},{2,4,6},{1,3,5}};
        int C[][];
        C = new int[5][5];

        int[] D[] = new int[5][5];
        int[] E, F[];
        E = new int [5];
        F = new int [5][5];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] x : B) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(B);

        // Jagged Array (2D)
        int A[][];
        A = new int[3][];

        A[0] = new int[5];
        A[1] = new int[3];
        A[2] = new int[8];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] x: A) {
            for (int y :x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}