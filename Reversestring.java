package javapractice;

public class Reversestring {
public static void main(String[] args) {
	String s = "Balajids";
	int length = s.length();
	String rev = "";
	StringBuilder b = new StringBuilder("Venkadesan keerthana");
//	b.reverse();
	System.out.println(b.reverse());
	for (int i =length-1; i>=0 ; i--) {
		rev = rev+s.charAt(i);
	}
	System.out.println(rev);
}

}
