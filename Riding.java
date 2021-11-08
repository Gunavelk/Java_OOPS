class Vehicle {
	void model() {
		System.out.println("Car");
	}
}

class car extends Vehicle {
	void model() {
		System.out.println("BMW");

	}
}

public class Riding{
	public static void main(String args[]) {
		car c = new car();
		c.model();
		Vehicle r = new Vehicle();
		r.model();

	}
}
