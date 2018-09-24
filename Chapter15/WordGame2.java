import java.util.Scanner;
import java.lang.Math;

public class WordGame2
{  
  public static void main ( String[] args )  
  {
    String word1;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter a word:");
    word1 = scan.nextLine();

    String word2;
    System.out.println("Enter another word:");
    word2 = scan.nextLine();

    int dots = 30 - (word1.length()+word2.length());
    System.out.print(word1);
    while (dots >= 0)
    {
        System.out.print(".");
        dots = dots-1;
    }
    System.out.print(word2);
  }
}