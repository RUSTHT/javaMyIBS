package operators;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Добро пожаловать в калькулятор JAVA");
        Scanner check = new Scanner(System.in);
        System.out.print ("\nВведите число: ");
        double num1 = check.nextDouble();
        Scanner gik = new Scanner(System.in);
        System.out.print ("Введите число: ");
        double num2 = gik.nextDouble();
        System.out.print("\nВведите тип арифметической операции (+, -, *, /): ");
        char el = check.next().charAt(0);
        Double result = null;
        switch (el) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:  System.out.print("Error! Тип арфимитической операции не предусмотрен");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + el + " " + num2 + " = " + result);
    }
    }
