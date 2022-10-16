/*
 * Author Name: Revathi
 * Date: 16-10-2022
 * Created With: IntelliJ IDEA Community Edition
 */

package com.io.github;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ShoppingListReader {
    private static final String FILE_NAME = "src/main/resources/data/ShoppingList.csv";
    public void readShoppingList(){
    // declare and initiaise file input stream object
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME)
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
            System.err.println(exception.getMessage());
        }

    }
}
