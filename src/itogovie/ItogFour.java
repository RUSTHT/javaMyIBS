package itogovie;

import java.util.Scanner;

public class ItogFour {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int attempt = 0;
            boolean hintUsed = false;

            while (attempt < 3) {
                System.out.print("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает: ");
                String otvet = scanner.nextLine();

                if (otvet.equalsIgnoreCase("Заархивированный вирус")) {
                    System.out.println("Правильно!");
                    break;
                } else if (attempt <2 && otvet.equalsIgnoreCase("Подсказка")) {
                    System.out.println("Он скрыт в архиве и может нанести вред компьютеру.");
                    hintUsed = true;
                } else if (hintUsed && otvet.equalsIgnoreCase("Подсказка")) {
                    System.out.println("Подсказка уже недоступна.");
                    attempt--;
                } else if (attempt<1){
                    System.out.println("Подумай еще!");
                    attempt++;
                }
                else {
                    System.out.println("Обидно, приходи в другой раз");
                    break;
                }
            }
    }
}
