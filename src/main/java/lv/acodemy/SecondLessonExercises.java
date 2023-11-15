package lv.acodemy;

public class SecondLessonExercises {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("this is even number");
        } else {
            System.out.println("this is odd number");
        }

        int x = 10;
        int y = 12;
        int z = 14;

        if (x > y && x > z) {
            System.out.println("x is the largest");
        } else if (y > x && y > z) {
            System.out.println("y is the largest");
        } else if (z > x && z > y) {
            System.out.println("z is the larges");
        } else {
            System.out.println("whatever");
        }

        int num = 10;
        if (num == 0) {
            System.out.println("number is zero");
        } else if (num < 0) {
            System.out.println("this num is negative");
        } else {
            System.out.println("this num is positive");
        }

        double weight = 60;
        double height = 1.69;
        double bmi = weight / (height * height);
        System.out.println(bmi);

        if (bmi > 18.5) {
            System.out.println("underweight");
        } else if (bmi > 18.5 && bmi < 24.9) {
            System.out.println("normal");
        } else if (bmi > 25 && bmi < 29.9) {
            System.out.println("overweight");
        } else if (bmi > 30 && bmi < 34.9) {
            System.out.println("obese");
        } else if (bmi > 35 && bmi < 39.9) {
            System.out.println("severely obese");
        } else {
            System.out.println("mordibly obese");
        }
    }
}
