import java.util.Scanner;
import java.lang.Math;

public class MakeSum
{  
  public static void main ( String[] args )  
  {
    int n;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the number of sums:");
    n = scan.nextInt();

    double sum=0;
    while(n >= 1)
    {
        sum = sum + (1 / n);
        n = n - 1;
    }
    System.out.println("The sum is "+sum);
  }
}