/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Ashley
 */



/*
PSEUDOCODE
 */



package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution43 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution43 solution = new Solution43();

        String siteName = solution.getSiteName();
        String authorName = solution.getAuthorName();
        boolean jsFolder = solution.checkForJavaScriptFolder();
        boolean CSSFolder = solution.checkForCSSFolder();
        String file = solution.createHTMLFile(siteName, authorName);
        solution.createCSSFolder(siteName, CSSFolder);
        solution.createJavaScriptFolder(siteName, jsFolder);

    }


    private String getSiteName()
    {
        //ask for input for site name and return it
        System.out.println("Site name: ");
        return input.nextLine();
    }

    private String getAuthorName()
    {
        //prompt for input for author name and return it
        System.out.println("Author name: ");
        return input.nextLine();
    }

    private boolean checkForJavaScriptFolder()
    {
        //ask if the user wants a folder for javascript
        System.out.println("Do you want a folder for JavaScript? Enter y for yes. Anything else for no.");

        String answer = input.nextLine();

        //return true if response is y. false for anything else
        if(answer.equals("y"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean checkForCSSFolder()
    {
        //ask if the user wants a folder for CSS
        System.out.println("Do you want a folder for CSS? Enter y for yes. Anything else for no.");

        String answer = input.nextLine();
        //return true if response is y. false for anything else.
        if(answer.equals("y"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String createHTMLFile(String siteName, String authorName)
    {

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


        File file = new File(".data/myWebsite/" + siteName + "/index.html");


        try
        {
            BufferedWriter output = new BufferedWriter(new FileWriter(file));

            output.write(newFile);
        } catch (IOException e)
        {
            e.printStackTrace();
        }


        return newFile;

        //set the name of the site inside the title tag


        //set the author name of the site in the meta tag


        //create javascript folder if needed

        //create css folder if needed


        //close file



    }

    public void createJavaScriptFolder(String siteName, boolean js)
    {
        if(js)
        {
            File jsFolder = new File(".data/myWebsite/" + siteName + "/js");

            jsFolder.mkdirs();
        }
    }

    public void createCSSFolder(String siteName, boolean CSS)
    {
        if(CSS)
        {
            File CSSFolder = new File(".data/myWebsite/" + siteName + "/js");

            CSSFolder.mkdirs();
        }

    }

}