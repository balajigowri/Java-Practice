package javapractice;

public class While_Dowhileloop {
//		While loop is a entry check loop
	public static void main(String[] args) {

	    //1.initialization
		int a=0;
		//2.condition checking
		while (a<=10) {
			//3. print the logic
			System.out.println(a);
			//4. increment or decrement
			a++;
		}
	System.out.println("\n"+"While loop Finished-----------"+"\n");
		//1.initialization
		int b = 0;
		//2. print the logic
		do {
			System.out.println(b);
			//3.increment or decrement
			b++;
			//4.Condition checking 
		} while (b<10);
		System.out.println("\n"+"DoWhile loop Finished-----------"+"\n");
	}

}
