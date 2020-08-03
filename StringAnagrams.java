/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class StringAnagrams
{
  public static void main (String[]args)
  {
//              System.out.println("Hello World");
    Scanner sc = new Scanner (System.in);
    String first = "aabdc";
    String second = "abac";
    int arr[] = new int[256];
    // for (String a : first.toCharArray()){
    //     arr[(int)a-1]++;
    // }
    // 
    int f = 0;
    for (char c:first.toCharArray ())
      {
	int index = (int) c;
	  arr[index - 1]++;
      }
    for (char c:second.toCharArray ())
      {
	int index = (int) c;
	arr[index - 1]--;
      }
  for (int i:arr)
      {
	if (i < 0 || i > 0)
	  {
	    System.out.println ("Not Anagram");
	    f = 1;

	  }

      }
    if (f == 0)
      {
	System.out.println ("Anagram");
      }
  }
}
