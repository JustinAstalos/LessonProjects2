import java.util.Scanner;
import java.lang.Math;

public class Adder
{  
  public static void main ( String[] args )  
  {
    int x;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter an integer (Enter 0 to quit):");
    x = scan.nextInt();
    int y = 0;
    int total = 0;

    if (x == 0)
    {
        System.out.println("bye");
    }
    else
    {
        System.out.println("Enter another integer:");
        y = scan.nextInt();
        total = x+y;
        System.out.println("The total is "+total);
    }
  }
}