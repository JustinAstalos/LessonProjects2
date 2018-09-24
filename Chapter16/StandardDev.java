import java.util.Scanner;
import java.lang.Math;

public class StandardDev
{  
  public static void main ( String[] args )  
  {
    int n;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the number of numbers:");
    n = scan.nextInt();
    int divider = n;

    double sum = 0;
    double num = 0;
    double sumSqrd = 0;
    double sd = 0;
    while(n >= 1)
    {
      System.out.println("Enter a number:");
      num = scan.nextDouble();
      sumSqrd = sumSqrd + (num*num);
      sum = sum + num;
      n = n - 1;
    }
    System.out.println(sum+" "+sumSqrd);
    sum = (sum/divider);
    sumSqrd = (sumSqrd/divider);
    System.out.println(sum+" "+sumSqrd);

    sd = Math.sqrt(sumSqrd-(sum*sum));
    System.out.println(sd);
  }
}