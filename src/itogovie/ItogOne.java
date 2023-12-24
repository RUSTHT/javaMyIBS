package itogovie;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ItogOne {
        public static void main(String[] args) {
            double obmen, rub, roundedDollars, result;
            System.out.println("Курс доллара: ");
            Scanner kurs$ = new Scanner(System.in);
            obmen = kurs$.nextDouble();
            System.out.println("Количество рублей: ");
            Scanner rubli = new Scanner((System.in));
            rub = rubli.nextDouble();
            result = rub / obmen;
            roundedDollars = Math.round(result * 100.0) / 100.0;
            System.out.println("Курс доллара: " + obmen + "\nКоличество рублей: "+ rub + "\nИтого: "+ roundedDollars);
        }

    }