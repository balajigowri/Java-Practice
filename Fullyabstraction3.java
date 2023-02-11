package javapractice;

public class Fullyabstraction3 implements Fullyabstracion,FullyAbstraction2 {

	@Override
	public void customareService() {
		System.out.println("Customare service number is 001122");		
	}

	@Override
	public void personalLoan() {
		System.out.println("All customers can take the personal loan");	
		
	}

	@Override
	public void savingsAccount() {
		System.out.println("All customers who are have the bank account the saving "
				+ "account automatically enabled ");	
		
	}

	@Override
	public void currentAccount() {
		System.out.println("This current account only enabled who doing bussiness");	
		
	}
public static void main(String[] args) {
	Fullyabstraction3 f = new Fullyabstraction3();
	f.customareService();
	f.personalLoan();
	f.savingsAccount();
	f.currentAccount();
}
}
