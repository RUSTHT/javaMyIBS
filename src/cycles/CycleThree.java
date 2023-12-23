package cycles;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class CycleThree {
    public static void main(String[] args) {
        System.out.println("Примечание: значения данных вводим  через \",\" ");
        Scanner v = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int value = v.nextInt();
        double[] myArray = new double[value];
        for (int i = 0; i < myArray.length; i++){
            System.out.println("Введите значение элемента "+i+": ");
            myArray[i] = v.nextDouble();
        }
        System.out.println("Массив завершен \nНаходим среднее арифмитическое");
        //среднее арифметическое
        double sum = 0;
        for (int i=0;i<myArray.length;i++){
            sum = sum + myArray[i];
        }
        double avg = sum/myArray.length;
        System.out.println("\nСреднее арифметическое найдено: " + round(avg, 2));
        System.out.println("Результат умножения на средне арифметическое: ");
        //вывести все элементы массива, умноженные на среднее арифметическое
        for (int i=0;i<myArray.length;i++){
            myArray[i] = myArray[i]*avg;
            System.out.println(round(myArray[i],2));
        }
    }
    // Округлил после запятой
    private static String round(double value, int scale) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, RoundingMode.HALF_UP);
        return bd.toString();
    }
}