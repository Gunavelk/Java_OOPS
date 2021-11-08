interface Shapes{
	void design();
	void colors();
}
class Shapes2 implements Shapes{
	public void design() {
		System.out.println("Rectangle");
	}
	public void colors() {
		System.out.println("Blue");
	}
	
}
public class Interface {
 public static void main(String args[]) {
	 Shapes2 s=new Shapes2();
	 s.design();
	 s.colors();
	 
	 
 }
}
