/*
 * Author Name: Revathi
 * Date: 16-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShoppingListReader {
    private static final String FILE_NAME = "src/main/resources/data/ShoppingList.csv";

    public static void readShoppingList() {
        // declare and initiaise file input stream object
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            // create an int variable (beause read() method returns int) to store the charecter read from the file
            int charecter;
            //use read() method from FileInputStream class to read data
            while ((charecter = fileInputStream.read()) != -1) {
                System.out.print((char) charecter);
                // instead of println() we say print here
            }

        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }

    }
}
