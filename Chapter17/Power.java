import java.util.Scanner;
import java.lang.Math;

public class Power
{  
  public static void main ( String[] args )  
  {
    double x;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter x:");
    x = scan.nextDouble();

    double n;
    System.out.println("Enter n:");
    n = scan.nextDouble();

    double power=1;
    for (int i=0; i<n; i++ )
    {
        power = power*x;
    }
    System.out.println(power);
  }
}