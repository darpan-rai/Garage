public class Van extends Vehicle {

	// private variables to store the attributes of a car
	private String make, model;
	private int year;

	public Car(String manufacturer, String modelVariant, int dateOfReg, boolean isCar, boolean isMotorcycle, boolean isVan)
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

	public static void main(String[] args) {
		Car car1 = new Car("Ford", "Focus", 2005);
		Car car2 = new Car("BMW", "116i", 2006);

		System.out.println(car1);
		System.out.println(car2);
	}// end of main method
}
