package javapractice;

public class MethodOverRidding extends Methodoverload{

//	@Override
//	public void overload(int a) {
//		// TODO Auto-generated method stub
//		super.overload(a);
//	}
	int salary=500;
	int ticket=450;
	@Override
	public void overload(int salary, int ticket, char gender) {

		System.out.println("\t For overridding "+(salary+ticket)+"&----"+gender);
//		super.overload(salary, ticket, gender);
	}
	@Override
	public void overload(String name, int age, float salary) {
		//System.out.println(name,age,salary);
		
	}
	
	public static void main(String[] args) {
		MethodOverRidding ridding =  new MethodOverRidding();
		ridding.overload(400, 500, 'm');
		ridding.overload("Balaji", 27, 800000);
	}
}
