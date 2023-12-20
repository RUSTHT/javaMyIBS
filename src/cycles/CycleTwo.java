package cycles;
import java.util.Arrays;
import java.util.Scanner;

public class CycleTwo {
        public static void main(String[] args) {
          System.out.println("Введите целое положительное число: ");
            Scanner skinet = new Scanner(System.in);
              int n = skinet.nextInt();
              int nechet = 0;
              for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                        nechet = nechet + i;
                        }
                }
                System.out.println("Сумма всех нечетных чисел до " + n + "\nравно " + nechet);
        }
}