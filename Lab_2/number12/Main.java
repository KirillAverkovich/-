import java.util.Scanner;

public class LocalMinMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Кол-во строк матрицы: ");
        int rows = scanner.nextInt();

        System.out.print("Кол-во столбцов матрицы: ");
        int cols = scanner.nextInt();

       
        int[][] matrix = new int[rows][cols];
        System.out.println("Элементы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxLocalMin = Integer.MIN_VALUE;

      
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentElement = matrix[i][j];
                boolean isLocalMin = true;

               
                for (int k = i - 1; k <= i + 1; k++) {
                    for (int l = j - 1; l <= j + 1; l++) {
                        if (k >= 0 && k < rows && l >= 0 && l < cols && (k != i || l != j)) {
                            if (matrix[k][l] <= currentElement) {
                                isLocalMin = false;
                                break;
                            }
                        }
                    }
                    if (!isLocalMin) {
                        break;
                    }
                }

               
                if (isLocalMin && currentElement > maxLocalMin) {
                    maxLocalMin = currentElement;
                }
            }
        }

        System.out.println("Максимум среди локальных минимумов: " + maxLocalMin);
    }
}
