package JAVA_practise;

public class retruntype {

    int c = 10;
    public int Add(int a,int c){
        return a+c;
    }
    public int Sub(int a,int c){
        return a-c;
    }
    



    public static void main(String[] args) {
      retruntype  objectRType = new retruntype();
      int result = objectRType.Add(10, 18);

      int result1 = objectRType.Sub(10, 5);
      
      System.out.println(result + " " + result1);
    }
}
