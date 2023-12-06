package operators;

import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class TaskFourOperator {
    public static void main(String[] args) {

// Ввести три числа с клавиатуры x, y, z
        Scanner first = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = first.nextInt();

        Scanner second = new Scanner(System.in);
        System.out.println("Введите число:");
        int y = second.nextInt();

        Scanner third = new Scanner(System.in);
        System.out.println("Введите число:");
        int z = third.nextInt();
        third.close();
// среднее арифметическое чисел x, y, z
        double[] nums = {x, y, z};
        double result = 0;
        for (double e :nums) {
            result += e;
        }
        double ab = 0;
        ab = result / nums.length;
        System.out.println("Среднее арифметическое " + ab);

//        среднее арифметическое делим на 2 c округлением в меньшую сторону
        double cc = ab / 2;
        cc = Math.floor(cc);
        if (cc>nums.length) {
            System.out.println("Программа выполнена корректно");
        }
        // Ошибка, если число <=3
        else
            System.out.println("Error \nПрограмма выполнена некорректно \nДопустимое значение <=3");
    }
}
