package workwithdata;

import java.util.Random;

public class WorkWithDataFour {
        public static void main(String[] args) {
            System.out.println("Заполняем по дефолту массив из 15 чисел от -20 до 20");
            int[] mass = new int[15];
            Random rnd = new Random();
            for (int i = 0; i < mass.length; i++) {
                mass[i] = rnd.nextInt(41) - 20;
            }
            System.out.println("Массив заполнен: ");
            for (int num : mass) {
                System.out.print(num + " ");
            }
            System.out.println();
            int max = mass[0];
            int min = mass[0];
            for (int i = 1; i < mass.length; i++) {
                if (mass[i] > max) {
                    max = mass[i];
                }
                if (mass[i] < min) {
                    min = mass[i];
                }
            }
            System.out.println("Максимальный элемент: " + max + "\nМинимальный элемент: " + min);
            int maxAbsoluteValue = Math.max(Math.abs(max), Math.abs(min));
            System.out.println("Наибольшее по модулю: " + maxAbsoluteValue);
        }
    }
