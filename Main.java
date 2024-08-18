import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();// array size
    int a[] = new int[n]; //array declaration
    int product = 1;
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();// get the array element
      product =product*a[i];
    }
    for(int i=0;i<n;i++)
    {
      System.out.println((product/a[i]));
    }
    sc.close();
  }
}