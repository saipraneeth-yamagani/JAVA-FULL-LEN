package JAVA_practise.JAVA_practise.OOP_JAVA;

public class pramethod {

    static void myMethod(String fname, int age) {
        if(age>18)
        {
        System.out.println("Mr "+ fname);
        }
        else if(age>60){
        System.out.println("sr "+ fname); 
        }
        else{
            System.out.println("Ms " + fname);
        }

        System.out.println(fname + " Refsnes " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 12);
        myMethod("Jenny", 68);
        myMethod("Anja", 22);
    }
}
