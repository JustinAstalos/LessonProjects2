import java.util.Scanner;
import java.lang.Math;

public class Wedge
{  
  public static void main ( String[] args )  
  {
    int height;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the height of the tree:");
    height = scan.nextInt();

    for (int i=height; i>0; i--)
    {
        for(int j = 0; j<i; j++ )
        {
            System.out.print("*");
        }
        System.out.println("");
    }
  }
}