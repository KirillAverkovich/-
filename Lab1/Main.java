import java.text.*;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) throws NumberFormatException {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Введите значение x: ");
                double x = scanner.nextDouble();

                System.out.print("Введите значение k: ");
                int k = scanner.nextInt();
                NumberFormat formatter = NumberFormat.getNumberInstance();
                formatter.setMaximumFractionDigits(k);
                double epsilon = Math.pow(10, -k); // Заданное значение эпсилон

                double taylorSum = computeTaylorSeries(x, epsilon);
                double standardExp = Math.exp(x);

                System.out.println("Приближенное значение через ряд Тейлора: " + formatter.format(taylorSum));
                System.out.println("Значение, вычисленное через стандартные функции: " + formatter.format(standardExp));

                scanner.close();
            }

            // Метод для вычисления суммы ряда Тейлора
            public static double computeTaylorSeries(double x, double epsilon) {
                double sum = 1.0; // Первое слагаемое ряда (n=0)
                double term = 1.0; // Текущее слагаемое
                int n = 1; // Индекс текущего слагаемого

                while (Math.abs(term) >= epsilon) {
                    term *= x / n;
                    sum += term;
                    n++;
                }
                return sum;
            }
        }
