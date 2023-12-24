package workwithdata;

import java.util.Arrays;
import java.util.Scanner;

public class WorkWithDataThree {
        public static void main(String[] args) {
            String a;
            String str2 = null;
            String str1 = "";
            int latinWord = 0;
            System.out.println("Введите строку из любых слов,разделенных пробелами: " + "\nНапример: I love java 8 Я люблю java 14 core1 ");
            Scanner str = new Scanner((System.in));
            a = str.nextLine();
            String[] b = a.split(" ");
            int s = b.length;
            String[] mass = new String[s];
            System.out.println("Создан массив:" + Arrays.toString(b));
            for (int i = 0; i <= b.length - 1; i++) {
                str1 = b[i];
                if (str1.matches("[A-Za-z]+")) {
                    str2 += b[i] + " ";
                    latinWord++;
                }
            }
            System.out.println("Выводим количество  слов состоящих только из латинских букв: ");
            System.out.println(str2.substring(4));
            System.out.println("Количество слов, состоящих только из латиницы: " + latinWord);
        }
    }
