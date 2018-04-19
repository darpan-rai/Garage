public class Van extends Vehicle {

	// private variables to store the attributes of a car
	private String make, model;
	private int year;

	public Van(String manufacturer, String modelVariant, int dateOfReg, boolean isCar, boolean isMotorcycle, boolean isVan)
	{
		super(isCar, isMotorcycle,isVan);
		make = manufacturer;
		model = modelVariant;
		year = dateOfReg;
	} // end of constructor

	/**
	 * This method returns a String to represent a car
	 * 
	 * @return
	 */
	public String toString() {
		return (make + " " + model + " " + year);
	}
}
