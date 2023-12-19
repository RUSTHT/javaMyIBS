package cycles;

import java.util.Scanner;
public class CycleOne {

        public static void main(String[] args) {
            int x = 5;
            int y = 9;
            int z = 16;
            Scanner value = new Scanner(System.in);
            System.out.println("Задайте размер массива: ");
            int size = value.nextInt();
            int [] array = new int[size];
            System.out.println("Вставить элементы массива: ");
            for (int i = 0; i < size; i++) {
                array[i] = value.nextInt();
            }
            for (int i = 0; i < size; i++){
                if (array[i] == x | array[i] == y | array[i] == z ){
                    System.out.println("Данное значение имеется в константах");
                    break;
                }
                else if (array[i] != x | array[i] != y | array[i] != z);
                System.out.println("Массив успешно сформирован");
                break;

            }
        }
    }
