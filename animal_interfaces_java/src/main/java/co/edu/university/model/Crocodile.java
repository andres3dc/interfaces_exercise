package co.edu.university.model;

public class Crocodile extends Animal implements Terrestrial, Swimmer {
    public Crocodile(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public boolean isSwimming() {
        return true;
    }

    @Override
    public boolean isTerrestrial() {
        return true;
    }

    @Override
    public void runSpeed(double speed) {
        System.out.println("Crocodile run speed: " + speed);
    }

    @Override
    public void swimSpeed(double speed) {
        System.out.println("Crocodile swim speed: " + speed);
    }
}
