package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {


    Solution45 solution = new Solution45();

    //test for getting input list
    @Test
    void testReplaceWord()
    {
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead. For example, \"She uses an IDE to write her Java programs\" instead of \"She uses an IDE to write her Java programs\". ";
        String actual = solution.getInputInfo();
        actual = solution.replaceWord(actual);

        assertEquals(expected, actual);
    }


    @Test
    void testGetInputInfo()
    {
        String expected = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead. " +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She " +
                "utilizes an IDE to write her Java programs\". ";

        String actual = solution.getInputInfo();

        assertEquals(expected, actual);
    }

    @Test
    void testMakeOutput()
    {
        String phrase = solution.getInputInfo();
        String newPhrase = solution.replaceWord(phrase);
        solution.makeOutput(newPhrase);


    }

}