public class Van extends Vehicle {

	// private variables to store the attributes of a van
	private String gearType="";
	//private int year;

	public Van(int id, String manufacturer, String gearType, boolean isCar, boolean isMotorcycle, boolean isVan)
	{
		super(id, manufacturer, isCar, isMotorcycle,isVan);
		this.gearType = gearType;
		
	} // end of constructor

	public String getGearType()
	{
		return gearType;
	}
	/**
	 * This method returns a String to represent a car
	 * 
	 * @return
	 *
	*public String toString() {
	*	return (make + " " + model + " " + year);
	*}
	*/
}
