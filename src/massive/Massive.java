package massive;

public class Massive {
    public static void main(String[] args) {
// Использовал различные варианты:
//        int[] myArray = new int[] {10, 20, 30, 40, 50};
//        int[] myArray = {10, 20, 30, 40, 50};
        int[] myArray;
        myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;
        int first = myArray[0];
        // int first = myArray[myArray.length-5];
        int middle = myArray[myArray.length-3];
        int last =  myArray[myArray.length-1];
        int a = last;
        last = first;
        first = a;
        System.out.println("Сумма первого и среднего элемента:" + (first+middle));
    }
}
