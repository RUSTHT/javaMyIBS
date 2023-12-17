package operators;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Converter {
    private static final String massa = "Килограммы: %s \n Фунты: %s \n Унции: %s \n Караты: %s ";
    private static final String metr = "Метры: %s \n Мили: %s \n Ярды: %s \n Футы: %s ";
    public static void main(String[] args) {
        Scanner unitas = new Scanner (System.in);
        System.out.println("Сделайте выбор единицы измерения: \n1 - Масса \n2 - Расстояние \nВаш выбор:");
        Double a = unitas.nextDouble();
        if (a==1)
            System.out.println("Выберите единицу измерения:\n 1 - Килограммы \n 2 - Фунты \n 3 - Унции \n 4 - Пуды \nВаш выбор:");
        else {
            System.out.println("Выберите единицу измерения: \n 1 - Метры \n 2 - Мили \n 3 - Ярды \n 4 - Футы \nВаш выбор:");
        }
        Scanner pondus = new Scanner(System.in);
        double b = pondus.nextDouble();
        System.out.println("Укажите число:");
        Scanner unreal = new Scanner(System.in);
        double c = 0;
        c = unreal.nextDouble();
        double [] mass = {a,b};
        String result = null;
        if (a==1 & b==1) {
            result = String.format(massa,roundDouble(c*1, 0), roundDouble(c*2.205, 3), roundDouble(c*35.27, 2), roundDouble(c*5000, 2));
        }
        else if (a==1 & b==2){
            result = String.format(massa, roundDouble(c*0.4536, 2), roundDouble(c*1, 3), roundDouble(c*16, 2), roundDouble(c*2268, 2));
        }
        else if (a==1 & b==3){
            result = String.format(massa, roundDouble(c*0.02835, 2), roundDouble (c*0.0625, 2), roundDouble(c*1,2), roundDouble (c*141.7, 2));
        }
        else if (a==1 & b==4){
            result = String.format(massa, roundDouble(c*0.0002,2),roundDouble (c*0.0004409,3),roundDouble(c*0.007055,2), roundDouble (c*1, 2));
        }
        else if (a==2 & b==1){
            result = String.format(metr, roundDouble(c*1,0),roundDouble (c*0.0006214,3),roundDouble(c*1.094,2), roundDouble (c*3.281, 2));
        }
        else if (a==2 & b==2){
            result = String.format(metr, roundDouble(c*1609,2),roundDouble (c*1,3),roundDouble(c*1760,2), roundDouble (c*5280, 2));
        }
        else if (a==2 & b==3){
            result = String.format(metr, roundDouble(c*0.9144,2),roundDouble (c*0.0005682,3),roundDouble(c*1,2), roundDouble (c*3, 2));
        }
        else if (a==2 & b==4){
            result = String.format(metr, roundDouble(c*0.3048,2),roundDouble (c*0.0001894,3),roundDouble(c*0.3333,2), roundDouble (c*1, 2));
        }
        System.out.println(result);
    }
    private static String roundDouble(double value, int scale) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(scale, RoundingMode.HALF_UP);
        return bd.toString();
    }
}
