import java.util.Scanner;

public class MatrixOperations {
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    private static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length, cols = mat1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length, cols1 = mat1[0].length, cols2 = mat2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        System.out.println("Addition:");
        printMatrix(addMatrices(matrix1, matrix2));

        System.out.println("Subtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2));

        System.out.println("Multiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix2));

        scanner.close();
    }
}
