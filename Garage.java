import java.util.ArrayList;

class Garage {

	public static ArrayList<Vehicle> vehicle = new ArrayList<>();

	public void initialize() {
		// create and add 3 ashes on 3 different ways
		Car car1 = new Car();
		Van van1 = new Van();
		this.Vehicle.add(car1); // "this" references the current object, but
		Vehicle.add(van1); // as there is no local trees variable
		Vehicle.add(new car1()); // defined the compiler picks the right one
		vehicle.add(new Vehicle());
	}

	public static void main(String[] args) {
		Car car1 = new Car("Ford", "Focus", 2005);
		Car car2 = new Car("BMW", "116i", 2006);

		System.out.println(car1);
		System.out.println(car2);
	}// end of main method

	/**
	 * public static void main(String[] args) { Forest forest = new Forest();
	 * forest.initialize(); for (Tree tree : forest.trees) { // FOR EACH loop
	 * System.out.println(tree.getClass()+" Age: "+tree.age); } }
	 */
}
