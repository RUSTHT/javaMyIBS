package workwithdata;

import java.util.Scanner;

public class WorkWithDataOne{
    public static void main(String[] args) {
        System.out.print("Сравниваем числа ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите первое число: ");
        String x = scanner.nextLine();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        double num1 = Double.parseDouble(x);
        if (num1 > num2) {
            System.out.println("Большее число: " + num1);
        } else if (num2 > num1) {
            System.out.println("Большее число: " + num2);
        } else  if (num1 == num2) {
            System.out.println("Числа равны");
            return; // Завершил метод при равентсве чисел
        }
        double smallNum1 = Math.min(num1, num2);
        System.out.println("Меньшее число: " + smallNum1);
    }
}
