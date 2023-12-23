package cycles;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CycleFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int row = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int column = scanner.nextInt();
        double[][] matrix = new double[row][column];
        System.out.println("Заполните матрицу: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Элемент матрицы [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Ввод данных завершен \nПервая строка матрицы, умноженная на 3: ");
        for (int j = 0; j < column; j++) {
            System.out.print(matrix[0][j] * 3 + " ");
        }
    }
}