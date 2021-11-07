
 class Details {

	int rollno;
	String name;
	String clgname;
	void record(int r,String n,String c)
	{
	rollno =r;
	name =n;
	clgname=c;
	}
	void show()
	{
		System.out.println(rollno+" "+name+" "+clgname);
	}
}
public class student {
		public static void main(String args[])
		{
			Details s= new Details();
			Details s1= new Details();
			Details s2= new Details();
			s.record(21,"Rahul","KLN");
			s1.record(42,"Arun","Thiyagarajar" );
			s2.record(18,"Varun","American");
			s.show();
			s1.show();
			s2.show();
		}
	}
	

