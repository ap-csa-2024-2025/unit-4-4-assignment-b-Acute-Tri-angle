import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Put your solutions below
    Scanner sc = new Scanner(System.in);
    System.out.println("enter word bucko");
    String s1 = sc.nextLine();
    System.out.println("enter target");
    String s2 = sc.nextLine();
    System.out.println("the substring " + s2 + " appears " + countSub(s1, s2) + " times.");

    /*
    System.out.println("enter a sentence/phrase");
    s1 = sc.nextLine();
    System.out.println("enter target");
    s2 = sc.nextLine();
    if (countProperContains(s1, s2) == 0){
      System.out.println("\"" + s2 + "\"" + " is properly contained in " + "\"" + s1 + "\"" + " " + countProperContains(s1, s2) + " times.");
    }
    else{
      System.out.println("\"" + s2 + "\"" + " is NOT properly contained in " + " \"" + s1 + "\"");
    }
    */
    sc.close();
  }

  public static int countSub(String word, String target)
  {
    int n = target.length();
    String sub = "";
    int counter = 0;
    for (int i = 0; i < word.length(); i++){
      if(i + n <= word.length()){
      sub = word.substring(i, i + n);
        if (sub.equals(target)){
          counter++;
        }
      }
    }
    return counter;
  }

  /*
  public static int countProperContains(String word, String target)
  {
    int occurance = 0;
    for (int i = 0; i < word.length()

  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
    */
}
