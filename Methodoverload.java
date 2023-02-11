package javapractice;

public class Methodoverload {

	public void overload(int a) {
		System.out.println("Based on datatype"+"\n"+a);
	}
	public void overload(int salary, int ticket, char gender ) {
		System.out.println("Based on datatype count"+"\n"+"Balaji salary:"+ salary+"\n"+"Train Ticket:"+ticket+"\n"+"Gender:"+gender);
	

	}
	public void overload(String name, int age, float salary ) {
		System.out.println("Based on datatype order"+"\n"+"Name:"+name+"\n"+"Age:"+age+"\n"+"Balaji salary:"+salary);

	} 
	
	public static void main(String[] args) {
		Methodoverload m = new Methodoverload();
		m.overload(100);
		m.overload(850000, 550, 'M');
		m.overload("Balaji", 27, 850000);

	}

}
