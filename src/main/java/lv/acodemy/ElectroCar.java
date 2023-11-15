package lv.acodemy;

public class ElectroCar {

    private String model;
    private int capacity;
    private int energy;

    public ElectroCar(String model) {
        this.model = model;
        this.capacity = 4;
        this.energy = 4;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void drive() {
        if (energy == 0) {
            System.out.println("Not enough energy. Please, charge me.");
        } else {
            System.out.println("Driving, will use 1 energy");
            energy--;
        }
    }

    public void charge() {
        if (energy == 4) {
            System.out.println("Your ELectroCar is Fully charged");
        } else {
            System.out.println("Charging. Will add 1 energy");
            energy++;
        }
    }


    @Override
    public String toString() {
        return "ElectroCar{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", energy=" + energy +
                '}';
    }
}
