/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Ashley
 */

package baseline;
import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution45 {

    public static void main(String[] args) {
        Solution45 solution = new Solution45();

        //get input into a single string
        String phrase = solution.getInputInfo();
        //replace the specified word in the string
        String newPhrase = solution.replaceWord(phrase);
        solution.makeOutput(newPhrase);
    }


    public String getInputInfo() {

        StringBuilder placeholder = new StringBuilder();
        //use bufferedReader to get input from file
        try {
            Scanner input = new Scanner(Paths.get("data/exercise45_input.txt"));
            //set the input file to a new string
            while(input.hasNextLine())
            {
                placeholder.append(input.nextLine());
            }
        } catch (Exception ex) {
            return "Invalid entry";
        }

        //return the string
        return placeholder.toString();

    }

    public String replaceWord(String phrase) {
        //set an old word and new word variable
        String newPhrase = phrase;
        String oldWord = "utilize";
        String newWord = "use";

        //replace any words within the string if it contains the string
        if (phrase.contains(oldWord)) {
            newPhrase = phrase.replace(oldWord, newWord);
        }

        return newPhrase;
    }

    public void makeOutput(String newPhrase) {
        //create an output file
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(String.valueOf(Paths.get("data/exercise45_output.txt"))));

            //print the new string to the file
            output.write(newPhrase);

            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}