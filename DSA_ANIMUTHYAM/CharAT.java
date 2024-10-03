package DSA_ANIMUTHYAM;

public class CharAT {
    // reverse a string
    public static void main(String[] args) {
        // String S = "abcba";
        // String ans = "";
        // for (int i = S.length()-1; i >= 0; i--) {
    //  printing the reserver order of numbers
        //     ans = ans + S.charAt(i);
        // }
        // if (ans.equals(S)) {
        //     System.out.println("Yes its a palindrome");
        // } else
        //     System.out.println("No its not a palindrome");

    
        // for to find string length
// we can use s.length() method
// and for array length we can 
// use arr.length method
// without brackets


// ANOTHER WAY 2
// WITH BREAK STATEMENT
// THIS BREAK IS USED TO BREAK THE LOOP IMEDIENATLY
// IF THE CONDITION IS TRUE
// SO THAT WE CAN SAVE TIME


boolean palindromeahh = true;
String s = "abccba";

int n=s.length();
         
for(int i=0;i<n/2;i++)
{
    if(s.charAt(i)!=s.charAt(n-i-1)) {

        palindromeahh = false;
        break;
    
    }

    if (palindromeahh) {
        System.out.println("Yes its a palindrome");
    } else
        System.out.println("No its not a palindrome");
        
    }

























    }
}










