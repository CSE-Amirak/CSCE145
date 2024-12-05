//Amira Kettaneh
public class Car extends Vehicle{

	//variables
	private double gasMileage;
	private int numberOfPassengers;
	
	//default constructor 
	public Car()
	{
		super();
		this.gasMileage = 0.0;
		this.numberOfPassengers = 0;
	}
	
	//parameterized constructor
	public Car(String xManufacturer, int xCylinder, String xOwner, double xgasMileage, int xnumberOfPassengers)
	{
		super(xManufacturer, xCylinder, xOwner);
		setGasMileage(xgasMileage);
		setNumberOfPassengers(xnumberOfPassengers);
	}
	
	//accessors
	public double getGasMileage()
	{
		return gasMileage;
	}
	
	public int getNumberOfPassengers()
	{
		return numberOfPassengers;
	}
	
	//mutators
	public void setGasMileage(double gasMileage)
	{
		 if (gasMileage >= 0) 
		 {
	            this.gasMileage = gasMileage;
	        } 
		 else 
	        {
	            System.out.println("Gas mileage cannot be negative.");
	        }
	    }
	
	public void setNumberOfPassengers(int numberOfPassengers) 
	{
        if (numberOfPassengers >= 0) 
        {
            this.numberOfPassengers = numberOfPassengers;
        } 
        else 
        {
            System.out.println("Number of passengers cannot be negative.");
        }
    }
	
	public boolean equals(Vehicle vs)
	{
        if (vs instanceof Car) 
        {
            Car car = (Car) vs;
            return super.equals(car) &&
                   this.gasMileage == car.gasMileage &&
                   this.numberOfPassengers == car.numberOfPassengers;
        }
        return false;
    }
	
	//toString
	public String toString()
	{
        return super.toString() + "\n" +
               "Gas Mileage: " + gasMileage + " gallons" +
               "\nNumber of Passengers: " + numberOfPassengers;
    }
}
