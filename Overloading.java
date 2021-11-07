import java.io.*;
class Staffdetails{
	int experience=1;
	void details(String name,int exp,int salary,String sub) {
		System.out.println("Name:"+name +"\nExp:" +exp+"\nSalary:"+salary+ "\nSubject:"+sub);
	}
	void details(String name,int salary, String sub) {
		System.out.println("Name:"+name+"\nExp:"+experience+"\nSalary:"+salary+"\nSubject:"+sub);
	}
}

public class Overloading {
	public static void main(String args[]) {
		Staffdetails s=new Staffdetails();
		s.details("raj",4,12000,"Maths");
		s.details("Mohan",18000,"English");
	}
}
