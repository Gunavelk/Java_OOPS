abstract class Bike{
	abstract void model();
	void color() {
		System.out.println("Black");
	}
}
class  Bike2 extends Bike{
	void model() {
		System.out.println("Pulsar");
	}
}
public class Abstraction {
	public static void main(String args[]) {
		
Bike b=new Bike2();
b.model();
b.color();
    }
}