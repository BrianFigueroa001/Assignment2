package assignment2;

/**
 * This class represents a car.
 * @author B-Man
 */
public class Car
{
    private String licenseNum ; // Stores License number.
    private int numOfTimesMoved ; // Tracks number of times the car is moved.

    /**
     * The constructor builds a car.
     * @param licenseNum The license number of the car.
     */
    public Car(String licenseNum)
    {
        this.licenseNum = licenseNum;
        numOfTimesMoved = 0 ; // Moved 0 times when created.
    }
    
    /**
     * Returns the car's license number.
     * @return The license number.
     */
    public String getLicenseNum()
    {
        return licenseNum ;
    }
    
    /**
     * Returns the amount of times the car was moved.
     * @return The number of times the car was moved.
     */
    public int getNumOfTimesMoved()
    {
        return numOfTimesMoved ;
    }

    /**
     * Changes the car's license number.
     * @param licenseNum The car's new license number.
     */
    public void setLicenseNum(String licenseNum)
    {
        this.licenseNum = licenseNum ;
    }

    /**
     * Changes the number of times the car moved.
     * @param numOfTimesMoved 
     */
    public void setNumOfTimesMoved(int numOfTimesMoved)
    {
        this.numOfTimesMoved = numOfTimesMoved ;
    }

}
