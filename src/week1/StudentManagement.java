package week1;

public class StudentManagement {
	//Cau 11
	Student[] arrayStudent = new Student[100];
	
	//Cau 12
	public static void studentsByGroup(Student[] arrayStudent, int SISO)
	{
		for( int i = 0 ; i < SISO ; i ++ )
		{
			arrayStudent[i].getInfo();
		}
		
	}
	
	//Cau 13
	public static void removeStudent(Student[] arrayStudent , int SISO, String id)
	{
		for( int i = 0 ; i < SISO ; i ++ )
		{
			int sinhvienthuN;
			if (arrayStudent[i].getID() == id )
			{
				sinhvienthuN = i;	
				for(int j = i ; j < SISO ; j++)
				{
					arrayStudent[j] = arrayStudent[j+1];
				}
				SISO = SISO - 1;
				break;
			}
		}
	}
	
	//Cau 9
	public static boolean sameGroup(Student student01, Student student02)
	{
		if (student01.getGroup() == student02.getGroup())
		{
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		
		
		student.setName("Son");
		student.setID("17020999");
		student.setGroup("K62IE4");
		student.setEmail("sonsieg1999@gmail.com");
		
		System.out.println("ten sv = " + student.getName());
		
		student.getInfo();
		
		// cau 8
		Student student01 = new Student();
		student01.Student();
		student01.getInfo();
		
		Student student02 = new Student();
		student02.Student("Son", "1702xxxx", "abcxyz@gmail.com");
		student02.getInfo();
		
		Student student03 = new Student();
		student03.Student(student02);
		student03.getInfo();	
		
		
		// Kiem tra o Cau 9
		if ( sameGroup(student01, student02) == true ) System.out.println("Cung lop");
		else System.out.println("Khong cung lop");
		
		// Cau 10
		Student s01 = new Student();
		s01.Student("A", "1702xxxx", "abcxyz@gmail.com");
		
		Student s02 = new Student();
		s02.Student("B", "1702xxxx", "abcxyz@gmail.com");
		
		Student s03 = new Student();
		s03.Student("B", "1702xxxx", "abcxyz@gmail.com");
		s03.setGroup("INT1111");
		
		System.out.println("s01 vs s02" + sameGroup(s01, s02));		
		System.out.println("s01 vs s03" + sameGroup(s01, s03));	
		
		
	}
}
