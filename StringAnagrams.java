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
    boolean isAnagram = false;
    int arr[] = new int[256];
//  Brute Force ---->>>
// 1. Itertate through one string and check the char exists in another String ---> n^2

    boolean visited[] = new boolean[second.length ()];
    if (first.length () == second.length ())
      {
	for (int i = 0; i < first.length (); i++)
	  {
	    char c = first.charAt (i);
	    for (int j = 0; j < second.length (); j++)
	      {
		if (second.charAt (j) == c && !visited[j])
		  {
		    visited[j] = true;
		    isAnagram = true;
		  }
	      }
	    if (!isAnagram)
	      {
		break;
	      }
	  }
      }
    if (isAnagram)
      {
	System.out.println ("Anagram");
      }
    else
      {
	System.out.println ("Not Anagram");
      }
//  2. Sort the strings and iterate and check each and every character then check for anageam --> O(nlog(n))
		//String original = "edcba";
        //char[] chars = original.toCharArray();
        //Arrays.sort(chars);
        //String sorted = new String(chars);
        //System.out.println(sorted);



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
