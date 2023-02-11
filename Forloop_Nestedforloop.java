package javapractice;

public class Forloop_Nestedforloop {

	public static void main(String[] args) {
//		for (int i = 0; i <= 10 ; i++) {
//			System.out.println(i);
//			//it's print 0 to 10
//		
//		}
//		System.out.println("--------------");
//		for (int i = 0; i <=10; i=i+2) {
//			System.out.println(i);
//			//It's print 0 2 4 6 8 10 like even number.			
//		}
//		System.out.println("--------------");
//		for (int i = 0; i <= 10; i=i+3) {
//			System.out.println(i);
//		}
//				//1.i=0   2.0<=3t
		for (int i = 0; i <=3; i++) {
			//3.1print i=0 
			System.out.println(i);
			//3.2 j=0  4. 0<=3  
			for (int j = 0; j <=3; j++) {
				//5. print j=0 6. j++ 7.j=1 8. 1<=3 9. print j value 1 
				//10 then j++ 
				System.out.println(j);
			}
		}
	}

}
