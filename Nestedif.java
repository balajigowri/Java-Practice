package javapractice;

public class Nestedif {

	
	int height = 173;
	int weight = 70;
	String runningSpeed ="Four round cpmpleted with in 7mins";
	public void policeSelection() {
		if (height>170) {
			System.out.println("Height is enough for selection");
			if (weight>65) {
				System.out.println("Weight is enough for selection");
				if (runningSpeed=="Four round cpmpleted with in 7mins") {
					System.out.println("Yes! You are selected for police");
				}
			}
		}
		
		else {
			
			System.out.println("Sorry! You are not selected for police");
		}
	}
	
	public static void main(String[] args) {
		
		Nestedif n = new Nestedif();
		n.policeSelection();
		

	}

}
