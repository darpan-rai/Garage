public class Car extends Vehicle {

	// private variables to store the attributes of a car
	private int seats;

	public Car(String manufacturer, boolean isCar, boolean isMotorcycle, boolean isVan, String modelVariant) {
		super(manufacturer, isCar, isMotorcycle, isVan);

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
