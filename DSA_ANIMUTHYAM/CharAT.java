package DSA_ANIMUTHYAM;

public class CharAT {
    // reverse a string
    public static void main(String[] args) {
        String S = "chapri";
        String ans = "";
        for (int i = 5; i >= 0; i--) { // printing the reserver order of numbers
            ans = ans + S.charAt(i);
        }
        System.out.println(ans);
    }
}
