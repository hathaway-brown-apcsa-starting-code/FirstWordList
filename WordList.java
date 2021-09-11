
/**
 * The Task: Create a List of five-letter words,
 * read from the user.
 *
 * @author APCS-A @ Hathaway Brown School
 * @version Original 2021
 */

import java.util.Scanner;
import java.util.ArrayList;

public class WordList
{
    public static void main (String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        ArrayList<String> myWords = new ArrayList<String>();
        String nextWord;
        
        System.out.println("Enter five-letter words. I will add them to the list.");
        nextWord = kbd.nextLine();
        while (nextWord.length() > 0)
        {
            // do something with the word and the list
            
            // print the list of words

            // get the next word
            nextWord = kbd.nextLine();
        } 
        
        System.out.println("\n\nGoodbye! Thank you for playing.");
    }
}
