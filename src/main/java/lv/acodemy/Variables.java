package lv.acodemy;

public class Variables {
    public static void main(String[] args) {
        System.out.println("This is Variables.java file");

        int myCurrentAge = 26;
        System.out.println("My current age is " + myCurrentAge);


        byte myWeight = 60; //byte data type
        short salary = 2000; //short data type
        char myFirstLetterOfName = 'A'; //character data type
        long populationOfLatvia = 1900000; // long data type

        double numberPi = Math.PI; // double number
        float numberRandom = 43122.14f; //float number

        //Boolean true/false is, has
        //Example: isSummer, isAdult etc.
        boolean isSummer = false;
        boolean isAutumn = true;

        int x = 10;
        int y = 2;
        int z = 12;
        int summa = x + y + z;
        System.out.println(summa);

        int remainder = 10 % 3;
        System.out.println(remainder);

        //String
        String myName = "Anna";
        String mySurname = "Kuramsina";
        System.out.println(myName + " " + mySurname);
        System.out.printf("My full name is %s %s\n", myName, mySurname);

    }
}


