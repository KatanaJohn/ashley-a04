package baseline;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    Sorter sorter = new Sorter();

    //test for getting input list
    @Test
    void testListInput() {
        List<String> nameList = sorter.getInputInfo();
        //4th name expected from input
        String expected = "Jones, Chris";
        //get 4th name in the list
        String actual = nameList.get(3);

        assertEquals(expected, actual);
    }


    //test for organize names
    @Test
    void testOrganizingNames() {
        List<String> nameList = sorter.getInputInfo();
        java.util.Collections.sort(nameList);
        //expected first name
        String expected = "Johnson, Jim";
        //check the first index
        String actual = nameList.get(0);

        assertEquals(expected, actual);
    }


    //test for count names
    @Test
    void testNameCount() {
        List<String> nameList = sorter.getInputInfo();


        int expected = 7;
        int actual = sorter.countNames(nameList);

        assertEquals(expected, actual);
    }






}