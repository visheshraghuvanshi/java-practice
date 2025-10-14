public class Main {
    public static void main(String[] args) {
        int[][] A = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int[][] B = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};
        int[][] C = new int[3][3];

        // Adding 2 matrices
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Addition: ");
        for (int[] x : C) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        // Multiplying 2 Matrices
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = 0;  // Reset C[i][j] for each element in the result matrix
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];  // Sum over k for matrix multiplication
                }
            }
        }

        System.out.println("Multiplication: ");
        for (int[] x : C) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        // Sorting Array of Strings
        String[] arr = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
        java.util.Arrays.sort(arr);
        for ( String x : arr) {
            System.out.print(x + " ");
        }
    }
}
