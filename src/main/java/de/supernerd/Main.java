package de.supernerd;

public class Main {

    public static void main(String[] args) {
        Car superNerddCar = new Car();
        superNerddCar.startEngine();

        superNerddCar.accelerates(50);
        superNerddCar.accelerates(150);
        superNerddCar.accelerates(125);


        Car batmobile = new Car();
        batmobile.accelerates(30);
        batmobile.accelerates(50);
        batmobile.accelerates(60);
        batmobile.accelerates(100);


        Person karlHeinz = new Person("Karl-Heinz", 45, "m", "blau");
        karlHeinz.vorstellen();

        Person melodie = new Person("Melodie", 30, "w", "grün");
        melodie.vorstellen();



    }
}
