package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Folders {

    private static final String WEBSITE = ".data/website/";

    public void createWebsite(String siteName)
    {
        //creates string for new website
        String newWebsite = WEBSITE + siteName;
        //creates the folder for the new website and places it
        File newFile = new File(newWebsite);
        newFile.mkdirs();
    }


    public void createHTMLFile(String siteName, String authorName)
    {
        //set the name of the site inside the title tag
        //set the author name of the site in the meta tag
        String newFile = ("""
        <!doctype html>
        <html>
        <head>
        <title>$siteName</title>
        <meta name = "author" content = "$authorName" />
        </head>
        <body>
        <p>PogU</p>
        </body>
        </html>""".replace("$siteName", siteName).replace("$authorName", authorName));


        //create new file
        File file = new File(WEBSITE + siteName + "/index.html");
        try
        {
            BufferedWriter output = new BufferedWriter(new FileWriter(file));

            output.write(newFile);
            output.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void createJavaScriptFolder(String siteName, boolean js)
    {
        //if the js boolean from earlier is true, a new folder is created for js
        if(js)
        {

            File jsFolder = new File(WEBSITE + siteName + "/js");

            jsFolder.mkdirs();
        }
    }

    //if the css boolean from earlier is true, a new folder is created for css
    public void createCSSFolder(String siteName, boolean css)
    {
        if(css)
        {
            File cssFolder = new File(WEBSITE + siteName + "/css");

            cssFolder.mkdirs();
        }

    }
}
