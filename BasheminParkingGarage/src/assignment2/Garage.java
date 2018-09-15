package assignment2;

/**
 * This class represents a garage.
 *
 * @author B-Man
 */
public class Garage
{ 
    private final int laneSize = 10 ;
    private Car[] parkingLanes ;

    /**
     * The constructor builds the garage with ten lanes.
     */
    public Garage()
    {
        parkingLanes = new Car[ laneSize ] ;
    }
    
    /**
     * The method takes a car and parks it in the garage.
     * @return String representation of the car being parked.
     */
    public String arrive()
    {
        
        return null ; //Place holder
    }
    
    /**
     * The method takes a car and parks it in the garage.
     * @return String representation of the car departing.
     */
    public String depart()
    {
        return null ;
    }

}
