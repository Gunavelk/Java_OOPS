abstract class Bike{
	abstract void model();
	void color() {
		System.out.println("Black");
	}
}
class  pulsar extends Bike{
	void model() {
		System.out.println("Pulsar");
	}
}
public class Vehicle{
	public static void main(String args[]) {
		
Bike b=new pulsar();
b.model();
b.color();
    }
}