import java.util.Scanner;
import java.lang.Math;

public class WordGame
{  
  public static void main ( String[] args )  
  {
    String word;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter a word:");
    word = scan.nextLine();

    int reps = 0;
    reps = word.length();
    while (reps>=2)
    {
        System.out.println(word);
        reps = reps-1;
    }
  }
}