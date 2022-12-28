import java.util.Scanner;
public class play
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner(System.in);
    mad_lib newGame = new mad_lib();
    
    System.out.println("Once upon a time there was a very " + newGame.get(input, "adjective") + " " + newGame.get(input, "noun"));
  }
}
