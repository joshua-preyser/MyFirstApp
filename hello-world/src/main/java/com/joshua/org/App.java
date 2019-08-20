package com.joshua.org;

import java.io.IOException;

import java.io.InputStreamReader;

import java.io.BufferedReader;


/**
 * This application will calculate the area of a rectangle.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println("This is my first Maven application.");
        //System.out.println( "Hello World!" );
        int length = 0;
        int width = 0;
        try
        {
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter the lenght of the rectangle.");
            length = Integer.parseInt(BR.readLine());
            System.out.println("Please enter the width of the rectangle.");
            width = Integer.parseInt(BR.readLine());
        }
        // If the user enters any invalid input,
        catch(NumberFormatException ne)
        {
            System.out.println("This value is invalid." + ne);
            System.exit(0);
        
        }
        catch(IOException ioe)
        {
            System.out.println("IO error: " + ioe);
            System.exit(0);
        }
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
        
    }
}
