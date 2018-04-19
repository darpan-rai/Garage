public class Motorcycle extends Vehicle {

	// private variables to store the attributes of a motorcycle
	private String model ="";
	private int year;

	public Motorcycle(int id, String manufacturer, String modelVariant, int dateOfReg, boolean isCar, boolean isMotorcycle, boolean isVan)
	{
		super(id, manufacturer, isCar, isMotorcycle, isVan);
		this.model = modelVariant;
		this.year = dateOfReg;
	} // end of constructor

	public String getModel()
	{
		return model;
	}
	
	public int getYear()
	{
		return year;
	}
	/**
	 * This method returns a String to represent a car
	 * 
	 * @return
	 */
	public String toString() {
		return (make + " " + model + " " + year);
	}
}
