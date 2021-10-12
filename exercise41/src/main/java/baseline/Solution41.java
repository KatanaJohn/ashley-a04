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
import java.util.ArrayList;
import java.util.List;
import java.io.*;



public class Solution41 {

    public static void main(String[] args)
    {
        Solution41 solution = new Solution41();


        List<String> nameList = solution.getInputInfo();
        nameList = solution.organizeNames(nameList);
        int names = solution.countNames(nameList);
        solution.writeToOutput(nameList, names);


    }


    public List<String> getInputInfo()
    {
        //make list to add names to
        List<String> nameList = new ArrayList<>();




        try {
            BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\Owner\\Desktop\\COP3330\\assignment04\\exercise41\\data\\exercise41_input.txt"));
            String name;
            while((name = input.readLine()) != null)
            {
                nameList.add(name);
                System.out.println(name);
            }
        } catch (Exception ex)
        {
            return nameList;
        }
        return nameList;
    }


    public List<String> organizeNames(List<String> nameList)
    {
        java.util.Collections.sort(nameList);
        return nameList;
    }

    public int countNames(List<String> nameList)
    {
        return nameList.size();
    }


    private void writeToOutput(List<String> nameList, int names)
    {
        System.out.printf("Total of %d names", names);
        System.out.println("-------------------------------------------------");
        int i = 0;

        try
        {
            BufferedWriter output = new BufferedWriter(new FileWriter("C:\\Users\\Owner\\Desktop\\COP3330\\assignment04\\exercise41\\data\\exercise41_output.txt"));
            while(i < names)
            {
                output.write(nameList.get(i) + "\n");
                System.out.println(nameList.get(i));
                i++;
            }
            output.close();
        } catch(Exception ex)
        {
            return;
        }
    }

}