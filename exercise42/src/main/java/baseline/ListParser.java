package baseline;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListParser {

    public List<String> getInputInfo()
    {

        //declare arraylist
        List<String> nameList = new ArrayList<>();

        //take in the input file and use bufferedreader
        try {
            Scanner input = new Scanner(Paths.get("data/exercise42_input.txt"));
            String name;
            //while the .txt is not null/empty, add each line to the list
            while ((name = input.nextLine()) != null) {
                nameList.add(name);
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


    public String[] splitList(List<String> nameList)
    {
        String[] tempArray;
        String[] namesArray = new String[nameList.size()];
        int i = 0;
        for(String a : nameList)
        {
            //split string into array
            tempArray = a.split("[,]", 3);
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






}
