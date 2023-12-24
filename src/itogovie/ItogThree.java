package itogovie;

import java.util.Scanner;

public class ItogThree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String maxUniqueString = "";
        int maxUniqueChars = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Строка " + i + ": ");
            String string = scanner.nextLine();
            int uniqueChars = countUniqueChars(string);
            if (uniqueChars > maxUniqueChars) {
                maxUniqueChars = uniqueChars;
                maxUniqueString = string;
            }
        }
        System.out.println("Ответ: " + maxUniqueString);
    }
    private static int countUniqueChars(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.indexOf(string.charAt(i)) == i) {
                count++;
            }
        }
        return count;
    }
}
