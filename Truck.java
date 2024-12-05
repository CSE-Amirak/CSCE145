//Amira Kettaneh
public class Truck extends Vehicle {
	
    // variables
    private double loadCapacity;
    private double towingCapacity;

    // default constructor
    public Truck()
    {
        super(); 
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // parameterized constructor 
    public Truck(String xManufacturer, int xCylinders, String xOwner, double xloadCapacity, double xtowingCapacity) 
    {
        super(xManufacturer, xCylinders, xOwner); 
        setLoadCapacity(xloadCapacity);
        setTowingCapacity(xtowingCapacity);
    }

    // Accessors 
    public double getLoadCapacity()
    {
        return this.loadCapacity;
    }

    public double getTowingCapacity()
    {
        return this.towingCapacity;
    }

    // mutators 
    public void setLoadCapacity(double xloadCapacity) 
    {
        if (xloadCapacity >= 0) 
        {
            this.loadCapacity = xloadCapacity;
        } 
        else 
        {
            System.out.println("Load capacity cannot be negative.");
        }
    }

    public void setTowingCapacity(double xtowingCapacity) 
    {
        if (xtowingCapacity >= 0) 
        {
            this.towingCapacity = xtowingCapacity;
        } 
        else 
        {
            System.out.println("Towing capacity cannot be negative.");
        }
    }

    // equals method to compare two trucks
    public boolean equals(Vehicle vs) 
    {
        if (vs instanceof Truck) 
        {
            Truck truck = (Truck) vs;
            return super.equals(truck) &&
                   this.loadCapacity == truck.loadCapacity &&
                   this.towingCapacity == truck.towingCapacity;
        }
        return false;
    }

    // toString method
    public String toString() {
        return super.toString() + "\n" +
               "Load Capacity: " + loadCapacity + "\n" +
               "Towing Capacity: " + towingCapacity;
    }
}

