interface Shapes{
	void design();
	void colors();
}
class rectShape implements Shapes{
	public void design() {
		System.out.println("Rectangle");
	}
	public void colors() {
		System.out.println("Blue");
	}
	
}
public class Structure{
 public static void main(String args[]) {
	 Shapes2 s=new Shapes2();
	 s.design();
	 s.colors();
	 
	 
 }
}
