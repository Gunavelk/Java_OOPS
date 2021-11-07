import java.io.*;
import java.util.*;
class Student1{
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
class Student2 extends Student1{
	int total,avg;
	
	void information2() {
	information();
			 
	}
	
	void display2() {
		display();
		total=english+tamil+maths;
		avg=total/3;
		System.out.println("Total:"+total);
		System.out.println("Avg:"+avg);
		
	}
}

public class inheritance {
	public static void main(String args[]) {
		Student2 st=new Student2();
	st.information2();
	st.display2();
		
	}

}
