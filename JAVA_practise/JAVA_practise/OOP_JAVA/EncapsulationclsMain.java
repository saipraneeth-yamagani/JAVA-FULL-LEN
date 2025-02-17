package JAVA_practise.JAVA_practise.OOP_JAVA;

public class EncapsulationclsMain {

    private String name;

    public String getname() {
        return name;
    }

    public void setname(String newname) {
        this.name = newname;
    }

    // class EncapsulationclsMain
    public static void main(String[] args) {
        EncapsulationclsMain myobj = new EncapsulationclsMain();
        myobj.setname("sai");
        String myname = myobj.getname();
        System.out.println("  my name is " + myname);
    }
}
