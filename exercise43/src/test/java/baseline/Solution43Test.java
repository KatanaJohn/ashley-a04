package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {




    Solution43 solution = new Solution43();
    Folders folder = new Folders();
    final String location = ".data/website/boo";


    @Test
    void testCreateWebsite()
    {
        folder.createWebsite("boo");
        Path path = Paths.get(location);
        assertTrue(Files.exists(path));
    }

    @Test
    void testHTMLCreation()
    {
        folder.createWebsite("boo");
        folder.createHTMLFile("boo", "ghost");
        String newLocation = location + "/index.html";
        Path path = Paths.get(newLocation);
        assertTrue(Files.exists(path));
    }




    @Test
    void createJavaScriptFolder()
    {
        folder.createJavaScriptFolder("boo", true);
        String currentLocation = location + "/js";
        Path path = Paths.get(currentLocation);
        assertTrue(Files.exists(path));
    }

    @Test
    void createCSSFolder()
    {
        folder.createCSSFolder("boo", true);
        String currentLocation = location + "/css";
        Path path = Paths.get(currentLocation);
        assertTrue(Files.exists(path));
    }

//

}