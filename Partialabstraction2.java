package javapractice;

public class Partialabstraction2 extends Partialabstraction{

	

	@Override
	public void passWord() {
		System.out.println("Password is date of birth of user");
		
	}

	@Override
	public void userName(String username) {
		username = "Balaji";
		System.out.println(username);
		
	}
	public static void main(String[] args) {
		Partialabstraction2 p = new Partialabstraction2();
		p.userName(null);
		p.passWord();
	}

	
}
