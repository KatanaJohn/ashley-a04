package baseline;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Frequency {


    public Map<String, Integer> getInputWordFrequency()
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

        return wordFrequency;
    }

    public Map<String, Integer> sortByMostUsedWord(Map<String, Integer> wordFrequency)
    {

        //create a linked hash map (easier printing later)
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        //sort map
        wordFrequency.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        //return linked hash map
        return sortedMap;
    }

}
