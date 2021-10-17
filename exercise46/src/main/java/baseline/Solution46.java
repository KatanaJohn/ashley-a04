/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Ashley
 */

/*
create map using strings/integer as a count
read through file adding to map. use if statement to check if a word exists
sort map by greatest number of appearances/integer values
 */


package baseline;
import java.util.*;

public class Solution46 {

    public static void main(String[] args)
    {
        Solution46 solution = new Solution46();
        Frequency frequency = new Frequency();

        Map<String, Integer> wordFrequency = frequency.getInputWordFrequency();

        wordFrequency = frequency.sortByMostUsedWord(wordFrequency);

        solution.printOutput(wordFrequency);
    }



    private void printOutput(Map<String, Integer> wordFrequency)
    {
        for(Map.Entry<String, Integer> entry : wordFrequency.entrySet())
        {
            //get the string name/key of the map
            String name = entry.getKey();
            System.out.printf("%s: ", name);
            //get the value/number of times key appeared
            int count = entry.getValue();

            //print a * per number of appearances
            for(int i = 0; i < count; i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
