import java.util.Scanner;
public class mad_lib
{
  String noun, verb, adjective, adverb;
  
  mad_lib()
  {
    noun = "";
    verb = "";
    adjective = "";
    adverb = "";
  }
  mad_lib(String n, String v, String adj, String adv)
  {
    noun = n;
    verb = v;
    adjective = adj;
    adverb = adv;
  }
  
  public String get(Scanner in, String type)
  {
    string word;
    if (type.equals("noun"))
    {
      System.out.println("please enter a noun ");
    } 
    else if (type.equals("verb"))
    {
      System.out.println("please enter a verb ");
    }
    if (type.equals("adjective"))
    {
      System.out.println("please enter a adjective ");
    } 
    else if (type.equals("adverb"))
    {
      System.out.println("please enter a adverb ");
    }
    else
    {
      System.out.println("Not a valid type ");
    }
    
    word = in.nextLine();
    return word;
  }
}
