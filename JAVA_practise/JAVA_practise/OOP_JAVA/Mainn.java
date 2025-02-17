package JAVA_practise.OOP_JAVA;

public class Mainn { // Parent class

    String carname = "Volvo";

    public void speed() {
        System.out.println(carname + " is " + "200 km/hr");
    }

    public static void main(String[] args) {
        Child myChild = new Child();
        myChild.carname = "BMW"; // Overriding parent class variable
        myChild.speed();
        myChild.rating();
    }
}

class Child extends Mainn {

    String year = "2021";

    public void rating() {
        System.out.println("5 star");
    }

    public int sound() {
        return 10;
    }

}
