import java.util.Scanner;
import java.lang.Math;

public class AddInts
{  
  public static void main ( String[] args )  
  {
    int numInts;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter a how many integers you are adding:");
    numInts = scan.nextInt();

    int total;
    System.out.println("Enter an integer:");
    total = scan.nextInt();

    while (numInts>=2)
    {
        System.out.println("Enter an integer:");
        total = total + scan.nextInt();
        numInts = numInts - 1;
    }
    System.out.println("Your total is "+total);
  }
}