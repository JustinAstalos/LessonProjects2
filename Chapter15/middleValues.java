import java.util.Scanner;
import java.lang.Math;

public class middleValues
{  
  public static void main ( String[] args )  
  {
    int start;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the first number:");
    start = scan.nextInt();

    int end;
    System.out.println("Enter the final number:");
    end = scan.nextInt();

    while (start != end)
    {
        System.out.println(start);
        start = start+1;
    }
    System.out.println(start);
  }
}