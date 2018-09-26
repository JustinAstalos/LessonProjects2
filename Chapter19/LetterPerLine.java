import java.util.Scanner;
import java.lang.Math;

public class LetterPerLine
{  
  public static void main ( String[] args )  
  {
    String word;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter a word:");
    word = scan.nextLine();

    for (int i=0; i<word.length(); i++)
    {
        System.out.println(word.substring(i,i+1));
    }
  }
}