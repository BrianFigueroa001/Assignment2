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
        String statement; //States the actions of the cars.

        while ( sc.hasNext() )
        {
            input = sc.next();
            car = new Car( input );
            input = sc.next();

            //Checks if the car is arriving or departing.
            if ( input.equals( "ARRIVE" ) )
            {
                statement = garage.arrive( car );
                System.out.print( statement );
            } 
            else //If the car is departing
            {
                statement = garage.depart( car );
                System.out.print( statement );
            }
        }
    }
}
