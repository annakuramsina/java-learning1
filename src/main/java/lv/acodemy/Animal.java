package lv.acodemy;

public class Animal {


    public String name;
    public int age;
    public String color;
    public String breed;
    public String gender;
    public boolean hasTale;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", hasTale=" + hasTale +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHasTale() {
        return hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }

    public void eat() {
        System.out.println("");
    }
}
