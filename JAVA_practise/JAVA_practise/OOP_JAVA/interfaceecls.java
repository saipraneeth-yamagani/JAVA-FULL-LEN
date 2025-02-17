package JAVA_practise.JAVA_practise.OOP_JAVA;


// interface is a reference type in java
interface interfaceecls {

 public void pigsound();
 public void stay();
    
} 

class pig implements interfaceecls{
    public void pigsound(){
        System.out.println("this is the sound method of pig implent of interface");
    }

    public void stay(){
        System.out.println("this is the stay method of pig implent of interface");
    }


}

class interfacee_runtime{
    public static void main(String[] args) {
        pig mypigg = new pig();
        mypigg.pigsound();
        mypigg.stay();
    }
}