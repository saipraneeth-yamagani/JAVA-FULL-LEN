package oops_j23 - JAVA.OOP - JAVA;

public class objectsOOP {
// Java program to demonstrate the use of objects 
// and class in Java
int id;
String name;


public void printStudent()
{
System.out.println("Id:" + id);
System.out.println("Name:" + name);
}
}

class GFG {
public static void main(String[] args)
{
  objectsOOP obj = new objectsOOP();

   obj.id = 1;
   obj.name = "ABC";

    obj.printStudent();
}
}

