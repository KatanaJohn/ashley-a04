package baseline;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {
    ListParser parser = new ListParser();

    //test for getInputInfo
    @Test
    void testListInput()
    {
        List<String> nameList = parser.getInputInfo();
        //4th name expected from input
        String expected = "Jones,Chris,34500";
        //get 4th name in the list
        String actual = nameList.get(3);

        assertEquals(expected, actual);
    }


    //test for organizeList
    @Test
    void testOrganizingNames()
    {
        List<String> nameList = parser.getInputInfo();
        java.util.Collections.sort(nameList);
        //expected first name
        String expected = "Johnson,Jim,56500";
        //check the first index
        String actual = nameList.get(0);

        assertEquals(expected, actual);
    }
    

    //test for splitList
    @Test
    void testSplitList()
    {
        List<String> nameList = parser.getInputInfo();
        java.util.Collections.sort(nameList);

        String[] finalList = parser.splitList(nameList);

        String expected = String.format("%-15s %-15s %-15s", "Jones", "Chris", "34500");
        String actual = finalList[2];

        assertEquals(expected, actual);
    }

}