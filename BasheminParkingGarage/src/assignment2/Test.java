package assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The test class reads from an input file to create cars and determine whether
 * they are arriving or departing.
 */
public class Test
{

    public static void main() throws FileNotFoundException
    {
        //Reads from the input file in the root directory.
        Scanner sc = new Scanner( new File( "garage.txt" ) );
        //Writes to the same input file in the root directory.fdvdfgbgdfbdfdf
        PrintWriter printWriter = new PrintWriter( "garage.txt" );
        Garage garage = new Garage();
        Car car;
        String input; // Stores strings from the file. 

        input = sc.next();
        car = new Car( input );
        input = sc.next();
        
        //Checks if the car is arriving or departing.
        if ( input.equals( "ARRIVE" ) )
        {
            garage.arrive( car );
        } 
        else
        {
            garage.depart(car);
        }
    }
}
