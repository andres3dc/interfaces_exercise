package co.edu.university.model;

public class Duck extends Animal implements Fly, Swimmer, Terrestrial{
    public Duck(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public boolean isFlying() {
        return true;
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
        System.out.println("Duck run speed: " + speed);
    }

    @Override
    public void swimSpeed(double speed) {
        System.out.println("Duck swim speed: " + speed);
    }

    @Override
    public void flySpeed(double speed) {
        System.out.println("Duck swim speed: " + speed);
    }

}
