package com.company;

import java.util.*;

public class JavaCollectionsOverview {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        // Declare String variable to store user's input
        String movieOrBook;

        // Prompt the user to enter his/her favorite movie or book and get it
        System.out.println("Please enter your favorite movie or book:");
        movieOrBook = keyboard.nextLine();

        // Create an ArrayList to store the
        ArrayList<String> bookMovieList = new ArrayList<>();
        //
        while (!movieOrBook.equalsIgnoreCase("Q")) {
            //Add items to the ArrayList with the add method.
            bookMovieList.add(movieOrBook);
            // Prompt the user to enter another favorite movie or book and get it
            System.out.println("Please enter another favorite movie or book or enter Q to quit:");
            movieOrBook = keyboard.nextLine();
        }

        // Sort the list of favorite movie/book with the sort method from Collections
        Collections.sort(bookMovieList);

        // Print sorted bookMovieList with an enhanced for loop.
        System.out.println();
        for (String list : bookMovieList) {
            System.out.println(list);
        }
    }
}
