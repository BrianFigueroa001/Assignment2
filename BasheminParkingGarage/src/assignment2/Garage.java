package assignment2;

/**
 * This class represents a garage.
 *
 * @author B-Man
 */
public class Garage
{ 
    private final int laneSize = 10 ;
    private final Car[] parkingLanes ;

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
    public String arrive(Car car)
    {
        
        return null ; //Place holder
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
