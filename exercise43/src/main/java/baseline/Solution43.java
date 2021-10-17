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
        Folders folder = new Folders();


        //gets site name input
        String siteName = solution.getSiteName();
        //gets string name input
        String authorName = solution.getAuthorName();
        //gets boolean for whether we want a js folder or not
        boolean jsFolder = solution.checkForJavaScriptFolder();
        //gets boolean for whether we want a css folder or not
        boolean cssFolder = solution.checkForCSSFolder();

        //creates website folder
        folder.createWebsite(siteName);
        //creates html file
        folder.createHTMLFile(siteName, authorName);
        //creates css folder if needed
        folder.createCSSFolder(siteName, cssFolder);
        //creates js folder if needed
        folder.createJavaScriptFolder(siteName, jsFolder);

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
        return answer.equals("y");
    }

    private boolean checkForCSSFolder()
    {
        //ask if the user wants a folder for CSS
        System.out.println("Do you want a folder for CSS? Enter y for yes. Anything else for no.");

        String answer = input.nextLine();
        //return true if response is y. false for anything else.
        return answer.equals("y");
    }






}