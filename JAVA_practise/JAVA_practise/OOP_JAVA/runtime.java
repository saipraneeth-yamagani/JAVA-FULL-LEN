package JAVA_practise.JAVA_practise.OOP_JAVA;
// abstract class
abstract class abstracTT {
        public abstract void animalSound();
        public void sleep() {
          System.out.println("Zzz");
        }
    }

  class Pig extends abstracTT {
            public void animalSound() {
          System.out.println("The pig says: wee wee");
      }
  }
        
 class runtime {
    public static void main(String[] args) {
        Pig mypigg = new Pig(); // Create a Pig object
        mypigg.animalSound();
        mypigg.sleep();
    }
            
                
}

