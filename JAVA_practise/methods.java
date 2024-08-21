package JAVA_practise;
public class methods {

    public static void main(String[] args) {
        System.out.println("hello medthods");
        methods va = new methods(); // create object to call medthods

        va.livevideo(); // call or exce
        va.unlikevideo();
    }

    public void livevideo() {
        // get video from youtube
        System.out.println("live video");

    }

    public void unlikevideo() {
        // unlike video
        System.out.println("unlike video");
    }
}
