package javapractice;

public class Break_continue_jumpingstatement {

	public static void main(String[] args) {
		
		//		1.		2.		4.
//		for (int i = 0; i < 10; i++) {
//			
//			
				//3.1
//			if (i==8) {
		
//				break;
//			}
		//3.2
//			System.out.println(i);
//		}
//		System.out.println("break process Done");
		
		//		1.		 2.		4.
		for (int i = 0; i <=10; i++) {
			//3.1
			if (i==2 || i==5) {
				System.out.println("Skipped");
				continue;
			}
			//3.2
			System.out.println(i);
		}
		
		System.out.println("Continue process is done"+"\n");
		
		for (int i = 0; i <5; i++) {
			System.out.println(i);
			
		}
		System.exit(0);
		System.out.println("It's Not to be printed");
		
	}


	
}
