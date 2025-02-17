package oops_j23;



public class constructorsai {

    int modelYear;
    String modelName;


    public constructorsai(int num) {
       System.out.println("Default constructor " + num);

    }

    // Constructor with parameters
    public constructorsai(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    
    // // Private constructor
    // private constructorsai() {
    //     System.out.println("Static constructor");
    // }





    public void display() {
        System.out.println(modelYear + " " + modelName);
    }

    public static void main(String[] args) {
        constructorsai myCar = new constructorsai(4);
        constructorsai myCar1 = new constructorsai(1289, "bmw");

        myCar.display(); // Output: 2006 audi
        myCar1.display(); // Output: 1289 bmw
    }
}
