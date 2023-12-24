package itogovie;

import java.util.Scanner;

public class ItogTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String y = scanner.nextLine();
        char[] equationArray = y.toCharArray();
        int x = -1;
        int o1 = -1;
        int o2 = -1;
        char operator = ' ';
        for (int i = 0; i < equationArray.length; i++) {
            if (equationArray[i] == 'x') {
                x = i;
            } else if (Character.isDigit(equationArray[i])) {
                if (o1 == -1) {
                    o1 = Character.getNumericValue(equationArray[i]);
                } else {
                    o2 = Character.getNumericValue(equationArray[i]);
                }
            } else if (equationArray[i] == '+' || equationArray[i] == '-') {
                operator = equationArray[i];
            }
        }
        int result;
        switch (x) {
            case 0:
                if (operator == '+') {
                    result = o2 - o1;
                } else {
                    result = o1 - o2;
                }
                break;
            case 1:
                if (operator == '+') {
                    result = o2 - o1;
                } else {
                    result = o1 - o2;
                }
                break;
            case 2:
                if (operator == '+') {
                    result = o1 + o2;
                } else {
                    result = o1 - o2;
                }
                break;
            default:
                throw new IllegalArgumentException("Недопустимый формат.");
        }
        System.out.println(result);
    }
}