package assignment2;

/**
 * This class represents a garage.
 *
 * @author B-Man
 */
public class Garage
{ 
    /*
    parkingLanes is an array representing 10 parking spaces in a garage.
    Cars enter through the front end of the array, and exit through the back
    end of the array.
    
    Arrive --> [] [] [] [] [] [] [] [] [] [] --> Depart
    */
    private final int laneSize = 10 ; //The garage has 10 parking psaces.
    private final Car[] parkingLanes ; //Stores parked cars.
    /*Tracks parking spots (index) available and used to tell
    which spot for an arriving car to park in.
    */
    private int openSpots = 9 ; // Starts with 10 (index + 1) open spots

    /**
     * The constructor builds the garage with ten lanes.
     */
    public Garage()
    {
        parkingLanes = new Car[ laneSize ] ;
    }
    
    /**
     * The method takes a car and parks it in the garage.
     * @param car Car that is arriving.
     * @return String representation of the car being parked.
     */
    public String arrive( Car car )
    {
        String message;
        //Parks a car in an open spot if the garage isn't full.
        if (openSpots >= 0)
        {
            parkingLanes[openSpots--] = car;
            message = "Car with license number " + car.getLicenseNum()
                    + "has arrived and parked in lane #" 
                    + (openSpots + 1) + "\n";
  
        }
        else //If the garage is full.
        {
            message = "The garage is full. Car with license number "
                    + car.getLicenseNum() + "is unable to park and drives on.";
        }
        
        return message;
    }
    
    /**
     * The method takes a car and parks it in the garage.
     * @param car Car that is departing
     * @return String representation of the car departing.
     */
    public String depart(Car car)
    {
        return null ;
    }
}
