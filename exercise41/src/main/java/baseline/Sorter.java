package baseline;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorter {


    public List<String> getInputInfo() {
        //make list to add names to
        List<String> nameList = new ArrayList<>();

        //make scanner input and get the path from data folder to file
        try {
            Scanner input = new Scanner(Paths.get("data/exercise41_input.txt"));
            String name;
            //while the file has a next line, add name to list
            while ((input.hasNextLine())) {
                name = input.nextLine();
                nameList.add(name);
                System.out.println(name);
            }
        } catch (Exception ex) {
            return nameList;
        }
        return nameList;
    }


    public List<String> organizeNames(List<String> nameList)
    {
        //organize the names using collections sort
        java.util.Collections.sort(nameList);
        return nameList;
    }

    //get number of names from list
    public int countNames(List<String> nameList)
    {
        return nameList.size();
    }


    public void writeToOutput(List<String> nameList, int names)
    {

        //used for printing through names
        int i = 0;

        //use buffered writer and a while loop to write out each name line by line to output file
        try
        {
            BufferedWriter output = new BufferedWriter(new FileWriter(String.valueOf(Paths.get("data/exercise41_output.txt"))));
            output.write("Total of " + names + " names\n");
            output.write("-------------------------------------------------\n");
            while(i < names)
            {
                output.write(nameList.get(i) + "\n");
                System.out.println(nameList.get(i));
                i++;
            }
            output.close();
        } catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
