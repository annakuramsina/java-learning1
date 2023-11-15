package lv.acodemy;

public class ObjectPractice {
    public static void main(String[] args) {
        Animal barsik = new Animal("Barsik", 3);
        System.out.println(barsik);

        barsik.name = "Barsik";
        System.out.println(barsik);

        barsik.setAge(30);
        System.out.println(barsik.age);

        barsik.setGender("male");

    }
}
