/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Ashley
 */

/*
read in the file and
organize the information from the file into an order
write the names/information into a new file
 */


package baseline;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;


public class Solution41 {

    public static void main(String[] args) {
        Sorter sorter = new Sorter();


        List<String> nameList = sorter.getInputInfo();
        nameList = sorter.organizeNames(nameList);
        int names = sorter.countNames(nameList);
        sorter.writeToOutput(nameList, names);

    }




}


