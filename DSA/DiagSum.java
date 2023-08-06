import java.util.Scanner;

public class DiagSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Taking input matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // If matrix is not square, convert it to a square matrix
        int size = Math.max(m, n);
        int[][] squareMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < m && j < n) {
                    squareMatrix[i][j] = matrix[i][j];
                } else {
                    squareMatrix[i][j] = 1;
                }
            }
        }

        // Finding sum of diagonal elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    int currentElement = squareMatrix[i][j];
                    for (int k = 0; k < size; k++) {
                        for (int l = 0; l < size; l++) {
                            if (k != i || l != j) {
                                if (squareMatrix[k][l] == currentElement) {
                                    count++;
                                }
                            }
                        }
                    }
                    if (count <= x) {
                        sum += currentElement;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
