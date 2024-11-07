package co.edu.university.model;

public class Tiger extends Animal implements Swimmer, Terrestrial {
    public Tiger(String name, int age, String gender) {
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
        System.out.println("Tiger run speed: " + speed);
    }

    @Override
    public void swimSpeed(double speed) {
        System.out.println("Tiger swim speed: " + speed);
    }
}
