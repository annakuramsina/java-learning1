package lv.acodemy;

public class Cars {
    public static void main(String[] args) {

        ElectroCar tesla = new ElectroCar("MODEL 3");
        System.out.println(tesla);

        tesla.drive();
        tesla.drive();
        tesla.drive();
        tesla.drive();
        tesla.drive();
    }
}
