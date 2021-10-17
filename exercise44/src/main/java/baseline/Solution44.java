/*
 * UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Ashley
 */

/*
take product name as input
possibly make product class
retrieve price/quantity for product from a file
 */


package baseline;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//pain
public class Solution44 {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution44 solution = new Solution44();
        try
        {
            //transfer json info to list of products
            ProductList pl = solution.getFileInput();
            while(true)
            {
                //get input search
                String search = solution.getInput();
                //search for product
                Product searchedProduct = pl.searchForProduct(search);

                //if true, end the loop. If false, loops again and checks for new product
                if(solution.printOutput(searchedProduct))
                {
                    break;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    private String getInput()
    {
        //ask and return input
        System.out.println("What is the product name?");
        return input.next();
    }


    //transfer input info from json to list of products
    private ProductList getFileInput() throws IOException
    {
        //create gson object
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        //create file read and read from json file
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data/exercise44_input.json"));

        //convert gson information to productlist info
        ProductList pl = gson.fromJson(bufferedReader, ProductList.class);
        bufferedReader.close();
        return pl;
    }


    public boolean printOutput(Product searchedProduct)
    {
        //if we didn't find the product, send back a false and search again
        if(searchedProduct == null)
        {
            System.out.println("Sorry, that product was not found in our inventory.");
            return false;
        }
        //if we do find the product, print its information and send back true to end the loop
        else
        {
            System.out.printf("Name: %s %n Price: %.2f %n Quantity: %d%n", searchedProduct.getName(), searchedProduct.getPrice(), searchedProduct.getQuantity());
            return true;
        }
    }



}

class ProductList
{
    //create list of products
    private final List<Product> products = new ArrayList<>();

    public Product searchForProduct(String search)
    {
        //search through each project and check its name to see if its equal to the input name
        for(Product product: products)
        {
            if(product.getName().equals(search))
            {
                return product;
            }
        }
        //if the name is not found, return null to indicate it's not in the list
        return null;
    }
}