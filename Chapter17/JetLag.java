import java.util.Scanner;
import java.lang.Math;

public class JetLag
{  
  public static void main ( String[] args )  
  {
    double hours;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter the number of hours of travel:");
    hours = scan.nextDouble();

    double zones;
    System.out.println("Enter the number of time zones crossed during travel:");
    zones = scan.nextDouble();

    double depart;
    System.out.println("Enter the departure time in 24 hour format:");
    depart = scan.nextDouble();
    if (depart > 8 && depart < 12)
    {
        depart = 0;
    }
    else if (depart >= 12 && depart < 18)
    {
        depart = 1;
    }
    else if (depart >= 18 && depart < 22)
    {
        depart = 3;
    }
    else if (depart >= 22 || depart < 1)
    {
        depart = 4;
    }
    else if (depart >= 1 && depart >= 8)
    {
        depart = 5;
    }

    double arrive;
    System.out.println("Enter the arrival time in 24 hour format:");
    arrive = scan.nextDouble();
    if (arrive > 8 && arrive < 12)
    {
        arrive = 4;
    }
    else if (arrive >= 12 && arrive < 18)
    {
        arrive = 2;
    }
    else if (arrive >= 18 && arrive < 22)
    {
        arrive = 0;
    }
    else if (arrive >= 22 || arrive < 1)
    {
        arrive = 1;
    }
    else if (arrive >= 1 && arrive >= 8)
    {
        arrive = 3;
    }

    double rest = ((hours/2)+(zones-3)+depart+arrive)/10.0;
    System.out.println("The amount of rest you should take is "+rest+" days");
  }
}