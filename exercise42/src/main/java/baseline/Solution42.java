/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */







package baseline;
import java.io.*;
import java.util.*;


public class Solution42 {


    public static void main(String[] args) {
        Solution42 solution = new Solution42();

        //call getInput
        List<String> namesList = solution.getInputInfo();

        //call organizeList
        namesList = solution.organizeList(namesList);

        int numberOfNames = solution.countNames(namesList);

        String[] namesArray = solution.splitList(namesList, numberOfNames);


        solution.writeOutput(namesArray);

    }


    public List<String> getInputInfo()
    {

        //declare arraylist
        List<String> nameList = new ArrayList<>();

        //take in the input file and use bufferedreader
        try {
            BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\Owner\\Desktop\\COP3330\\assignment04\\exercise42\\data\\exercise42_input.txt"));
            String name;
            //while the .txt is not null/empty, add each line to the list
            while ((name = input.readLine()) != null) {
                nameList.add(name);

                //System.out.println(name);
            }
        } catch (Exception ex)
        {
            return nameList;
        }
        //return the list
        return nameList;
    }




    public List<String> organizeList(List<String> nameList)
    {
       // organize the data alphabetically by last name using collections.sort
        java.util.Collections.sort(nameList);
        return nameList;
    }


    public int countNames(List<String> nameList)
    {
        return nameList.size();
    }


    public String[] splitList(List<String> nameList, int numberOfNames)
    {
        //split the strings using line.split with "'"
        /*for(int i = 0; i < nameList.size(); i++)
        {
            System.out.println(nameList.get(i) + "\n");
            namesArray = nameList.get(i).split(",");
        }*/

        String[] tempArray = new String[nameList.size()];
        String[] namesArray = new String[nameList.size()];
        int i = 0;
        for(String a : nameList)
        {
            //split string into array
            tempArray = a.split("[,]", 3);
            //System.out.println(tempArray[0] + tempArray[1] + tempArray[2]);
            //put the split strings into one full string
            String s = String.format("%-15s %-15s %-15s", tempArray[0], tempArray[1], tempArray[2]);
            //put the string into index i of main array
            namesArray[i] = s;
            //increment i by 1
            i++;

        }

        //return array of strings
        return namesArray;
    }

    private void writeOutput(String[] employeeList)
    {


        //formatting
        System.out.println("Last            First           Salary");
        System.out.println("------------------------------------------");
        //print the output using a for loop
        for(int i = 0; i < employeeList.length; i++)
        {
            System.out.println(employeeList[i]);
        }
        //also print output to output file
    }



}