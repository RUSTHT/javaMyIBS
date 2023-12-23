package workwithdata;

import java.util.Scanner;

public class WorkWithDataTwo {
    public static void main(String[] args) {
        String x, y = null;
        // I like Java!!! --- копипаст
        System.out.println("DO YOU LIKE JAVA? ");
        Scanner java = new Scanner((System.in));
        x = java.nextLine();
        if (x.contains("Java") && x.startsWith("I like") && x.endsWith("!!!")) {
            System.out.println(x.toUpperCase());
            y = x.replace("a", "o");
            System.out.println("Заменяем Java на Jovo: \n" + y.substring(7, 11));
        } else if (x.contains("Java") != true) {
            System.out.println("ERROR! Where this word in message? \"Java\" ");
            System.out.println("You don't like \"Java\"");
        } else if (x.startsWith("I like") != true) {
            System.out.println("ERROR! Where this phrase in message? \"I like\" ");
            System.out.println("OMG, why did you forget to write that you like me???");
        } else if (x.endsWith("!!!") != true) {
            System.out.println("ERROR! Потерялись знак: \"!!!\" ");
        }
    }
}
