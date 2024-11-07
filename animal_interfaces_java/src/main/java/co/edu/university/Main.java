package co.edu.university;

import co.edu.university.model.Crocodile;
import co.edu.university.model.Duck;
import co.edu.university.model.Tiger;

public class Main {
    public static void main(String[] args) {
        Duck pato = new Duck("Patico", 25, "Macho");
        pato.swimSpeed(100);
        pato.flySpeed(20);
        pato.runSpeed(90);
        System.out.println(pato.getName());


        Crocodile cocodrilo = new Crocodile("Cocodrilito", 50, "Hembra");
        cocodrilo.swimSpeed(100);
        cocodrilo.runSpeed(70);
        System.out.println(cocodrilo.getName());

        Tiger tiger = new Tiger("Tigre Falcao", 20, "Macho");
        tiger.swimSpeed(10);
        tiger.runSpeed(200);
        System.out.println(tiger.getName());
    }
}