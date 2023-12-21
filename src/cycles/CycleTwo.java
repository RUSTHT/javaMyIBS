package cycles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CycleTwo {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число: ");
        Scanner skinet = new Scanner(System.in);
        int n = skinet.nextInt();
        int nechet = 0;
        int i = 1;
        List<String> str = new ArrayList<>();
        while (i <= n) {
            str.add(Integer.toString(i));
            nechet += i;
            i += 2;
        }
        if (str.size() <= 20){
            System.out.println(String.join(" + ", str) + " = " + nechet);
        } else {
            System.out.println("Сумма всех нечетных чисел до " + n + "\nравно " + nechet);
        }
    }
}