import java.io.*;
import java.util.*;
class Student{
	int rollno;
	String name;
	int english,tamil,maths;

	void information() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the RollNo,Name,English,Tamil,Maths");
		rollno=s.nextInt();
		name=s.next();
		english=s.nextInt();
		tamil=s.nextInt();
		maths=s.nextInt();
	}
	
		void display() {
			System.out.println("Rollno:"+rollno +"\nName:"+name +"\nEnglish:"+english +"\nTamil:"+tamil+"\nMaths:"+maths);
		}
		
}
class markCalculation extends Student{
	int total,avg;
	
	void record() {
	information();
			 
	}
	
	void details() {
		display();
		total=english+tamil+maths;
		avg=total/3;
		System.out.println("Total:"+total);
		System.out.println("Avg:"+avg);
		
	}
}

public class School{
	public static void main(String args[]) {
		markCalculation st=new markCalculation();
	st.record();
	st.details();
		
	}

}
