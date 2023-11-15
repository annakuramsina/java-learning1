package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 11, 14, 15, 20};
        int myNumber = numbers[4];
        System.out.println(myNumber);

        //determine size of array
        System.out.println(numbers.length);

        //change number in array
        numbers[3] = 1337;
        System.out.println(Arrays.toString(numbers));

        int[] emptyArray = new int[12];
        System.out.println(Arrays.toString(emptyArray));

        emptyArray[0] = 10;
        emptyArray[3] = 7;
        emptyArray[8] = 9;
        emptyArray[9] = 12;
        System.out.println(Arrays.toString(emptyArray));

        //String [] array
        String[] fruitBasket = {"apples", "banana", "kiwi", "pear", "pineapple" };

        String fruit = fruitBasket[3];
        System.out.println(fruit);

        if (10 > 5) {
            System.out.println("this statement is true");
        }
        if (10 < 5) {
            System.out.println("this is statement is false");
        }
        if (fruitBasket[0].equals("apples")) {
            System.out.println("Yes, it's apple");
        }
        //if-else
        boolean isSummer = false;
        if (isSummer) {
            System.out.println("Beach");
        } else {
            System.out.println("home");
        }


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color: ");
        String light = myScanner.next();

        if (light.equals("GREEN")) {
            System.out.println("You can go");
        } else if (light.equals("YELLOW")) {
            System.out.println("Don't go, wait for the green light");
        } else if (light.equals("RED")) {
            System.out.println("STOP");
        }
    }
}
