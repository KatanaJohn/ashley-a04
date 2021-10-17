package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {

    Frequency frequency = new Frequency();

    @Test
    void testListInput()
    {
        Map<String, Integer> nameListExpected = new HashMap<>();

        //the original file is technically already ordered due to the order of adding being badger - mushroom - snake
        //tested this with a different input file before changing it back
        nameListExpected.put("badger", 7);
        nameListExpected.put("mushroom", 2);
        nameListExpected.put("snake", 1);

        Map<String, Integer> nameListActual = frequency.getInputWordFrequency();

        assertEquals(nameListExpected, nameListActual);

    }

    @Test
    void testListSort()
    {
        Map<String, Integer> nameListExpected = new HashMap<>();

        //Originally tested with other input file since technically the original input would already be sorted
        nameListExpected.put("badger", 7);
        nameListExpected.put("mushroom", 2);
        nameListExpected.put("snake", 1);
        Map<String, Integer> nameListActual = frequency.getInputWordFrequency();
        nameListActual = frequency.sortByMostUsedWord(nameListActual);

        assertEquals(nameListExpected, nameListActual);

    }


}