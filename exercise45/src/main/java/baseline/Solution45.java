/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Ashley
 */

package baseline;
import java.io.*;

public class Solution45 {

    public static void main(String[] args) {
        Solution45 solution = new Solution45();

        String phrase = solution.getInputInfo();
        String newPhrase = solution.replaceWord(phrase);
        solution.makeOutput(newPhrase);
    }


    public String getInputInfo() {

        String phrasePlaceholder;
        //use bufferedReader to get input from file
        try {
            BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\Owner\\Desktop\\COP3330\\assignment04\\exercise45\\data\\exercise45_input.txt"));
            //set the input file to a new string
            phrasePlaceholder = input.readLine();
        } catch (Exception ex) {
            return "Invalid entry";
        }

        //return the string
        return phrasePlaceholder;
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
            BufferedWriter output = new BufferedWriter(new FileWriter("C:\\Users\\Owner\\Desktop\\COP3330\\assignment04\\exercise45\\data\\exercise45_output.txt"));

            //print the new string to the file
            output.write(newPhrase);

            output.close();
        } catch (Exception ex) {
            return;
        }


    }

}