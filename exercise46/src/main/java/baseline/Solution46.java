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


import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Solution46 {

    public static void main(String[] args)
    {
        Solution46 solution = new Solution46();

        Map<String, Integer> wordFrequency = solution.getInputWordFrequency();

        wordFrequency = solution.sortByMostUsedWord(wordFrequency);

        solution.printOutput(wordFrequency);
    }

    private Map<String, Integer> getInputWordFrequency()
    {
        //create string-integer map
        Map<String, Integer> wordFrequency = new HashMap<>();

        //read in file and scan for words
        try(Scanner input = new Scanner(Paths.get("data/exercise46_input.txt")))
        {
            while(input.hasNext())
            {
                //get next word
                String word = input.next();

                //compare to other words in the map
                if(wordFrequency.containsKey(word))
                {
                    //increase value of word by 1
                    wordFrequency.put(word, wordFrequency.get(word)+1);
                }
                else
                {
                    //add a new word to the map if it does not exist
                    wordFrequency.put(word, 1);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //if the word doesn't exist, add it. if it does exist, increase integer by 1.

        return wordFrequency;
    }

    private LinkedHashMap<String, Integer> sortByMostUsedWord(Map<String, Integer> wordFrequency)
    {

        //create a linked hash map (easier printing later)
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        //sort map
        wordFrequency.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        //return linked hash map
        return sortedMap;
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
