import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Кол-во строк матрицы: ");
        int rowCount = scanner.nextInt();

        System.out.print("Кол-во столбцов матрицы: ");
        int columnCount = scanner.nextInt();

        int[][] matrix = new int[rowCount][columnCount];
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print("Введите значение матрицы [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxRow = 0; 
        int minRow = 0; 
        int maxElement = Integer.MIN_VALUE; 
        int minElement = Integer.MAX_VALUE; 

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                int currentElement = matrix[i][j];
                if (currentElement > maxElement) {
                    maxElement = currentElement;
                    maxRow = i;
                }
                if (currentElement < minElement) {
                    minElement = currentElement;
                    minRow = i;
                }
            }
        }

        int[] temp = matrix[maxRow];
        matrix[maxRow] = matrix[minRow];
        matrix[minRow] = temp;

        System.out.println("Измененная матрица:");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Строка с нулевым элементом на главной диагонали:");
        for (int i = 0; i < rowCount; i++) {
            if (matrix[i][i] == 0) {
                int maxInRow = Integer.MIN_VALUE;
                for (int j = 0; j < columnCount; j++) {
                    if (matrix[i][j] > maxInRow) {
                        maxInRow = matrix[i][j];
                    }
                }
                System.out.println("Строка " + i + ": Максимальный элемент = " + maxInRow);
            }
        }
    }
}
