/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */







package baseline;
import java.nio.file.Paths;
import java.util.*;


public class Solution42 {


    public static void main(String[] args) {
        Solution42 solution = new Solution42();
        ListParser parser = new ListParser();

        //call getInput
        List<String> namesList = parser.getInputInfo();

        //call organizeList
        namesList = parser.organizeList(namesList);

        String[] namesArray = parser.splitList(namesList);


        solution.writeOutput(namesArray);

    }

    private void writeOutput(String[] employeeList)
    {


        //formatting
        System.out.println("Last            First           Salary");
        System.out.println("------------------------------------------");
        //print the output using a for loop
        for (String s : employeeList) {
            System.out.println(s);
        }
        //also print output to output file
    }






}