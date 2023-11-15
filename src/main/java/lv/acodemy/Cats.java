package lv.acodemy;

public class Cats {
    public static void main(String[] args) {

        //create object with no parameters
        Animal cat1 = new Animal();
        System.out.println(cat1);

        //create object with 2 parameters
        Animal cat2 = new Animal("Oksi", 5);
        System.out.println(cat2);

        cat1.setName("Fanta");
        cat1.setAge(16);
        cat1.setBreed("unknown");
        cat1.setGender("Female");
        cat1.setHasTale(true);
        cat1.setColor("Grey");
        System.out.println(cat1);

    }
}
