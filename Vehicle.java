//Amira Kettaneh
public class Vehicle {

	//variables
	private String Manufacturer;
	private int Cylinders;
	private String Owner;
	
	//default constructor
	public Vehicle() 
	{
		this.Manufacturer ="";
		this.Cylinders = 0;
		this.Owner = "";
		
	}
	
	//parameterized constructor
	public Vehicle(String xManufacturer, int xCylinders, String xOwner)
	{
		setManufacturer(xManufacturer);
		setCylinders(xCylinders);
		setOwner(xOwner);
		
	}
	
	//accesors
	public String getManufacturer()
	{
		return this.Manufacturer;
	}
	
	public int getCylinders()
	{
		return this.Cylinders;
	}
	
	public String getOwner()
	{
		return this.Owner;
	}
	
	//mutators
	public void setManufacturer(String xManufacturer)
	{
		this.Manufacturer = xManufacturer;
	}
	
	public void setCylinders(int xCylinders)
	{
		if (xCylinders > 0)
		{
			this.Cylinders = Cylinders;
		}
		else
		{
			System.out.println("Number of cylinders must be greater than 0.");
		}
	}
	
	public void setOwner(String xOwner)
	{
		this.Owner = xOwner;
	}
	
	//boolean
	public boolean equals (Vehicle vs)
	{
		return this.Manufacturer.equalsIgnoreCase(vs.getManufacturer()) &&
				this.Owner.equalsIgnoreCase(vs.getOwner()) &&
				this.Cylinders == vs.getCylinders();
	}
	
	//toString method
	public String toString()
	{
		return "Manufacturer's Name: "+ Manufacturer + "\n"+
				"Number Of Cylinders: " + Cylinders + "\n"+
				"Owner's Name: "+ Owner;
	}
}
