package javapractice;

public class Stringpractice {
	
public static void main(String[] args) {
	int vow=0;
	int con=0;
	String s = " For the people of the people by the people ";
	String s2=" For the people of the people by the people ";
	String s3="Hello All";
	//1.length
	int length = s.length();
	System.out.println("Given String's length is :"+"\n"+length);
	//2. upperCase
	String upperCase = s.toUpperCase();
	System.out.println("change String's upperCase is :"+"\n"+upperCase);
	//3.lowercase
	String lowerCase = s.toLowerCase();
	System.out.println("change String's lowerCase is :"+"\n"+lowerCase);
	//4. replace
	String replace = s.replace("people", "Nation");
	System.out.println("change String's replace is :"+"\n"+replace);
	//5.CharAt
	char charAt = s.charAt(1);
	System.out.println("Find String's Char is :"+"\n"+charAt);
	//6.indexof 
	int indexOf = s.indexOf("p");
	System.out.println("Find String's indexOf 2nd is :"+"\n"+indexOf);
	//7.isEmply
	boolean empty = s.isEmpty();
	if (empty) {
		System.out.println("Given String is empty");
	}
	else {
		System.out.println("Given String is not empty");
	}
	//8.equals
	boolean equals = s.equals(s2);
	if (equals) {
		System.out.println("Yes! given Strings are equal");
		
	}
	else {
		System.out.println("No! given Strings are not equal");
	}
	//9.equalIgnorecase
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s2);
	System.out.println(equalsIgnoreCase);
	//10.concat
	String concat = s.concat(s3);
	System.out.println(concat);
	//11.subString= It's print from  10th index of Given String
	String substring = s.substring(10);
	System.out.println("It's print from  11th index of Given String :"+"\n"+substring);
	//12.Trim
	String trim = s.trim();
	System.out.println("Given String is remove the |>"
			+"\n"+ "unwanted space at before and after sentences");
	//13.compare doubt
	int compareTo = s.compareTo(s2);
	System.out.println(compareTo);
	
	//14.CharAt iteration
	for (int i = 0; i < length; i++) {
		char charAt2 = s.charAt(i);
	System.out.println(charAt2);
	
//		if (charAt2=='e') {
//			System.out.println(charAt2);
//		}
	}
	//15.indexof to find the index position of the String's char
	int indexOf2 = s.indexOf('l');
	System.out.println(indexOf2);
	//16.lastIndex to find last index position of the String's char
	int lastIndexOf = s.lastIndexOf('e');
	System.out.println(lastIndexOf);
	
	
	for (int i = 0; i < s.length(); i++) {
		char charAt2 = s.charAt(i);
		if (charAt2=='a'|| charAt2=='e'|| charAt2=='i'||charAt2=='o'||charAt2=='u') {
			System.out.println(charAt2);
			vow=vow+1;
			//System.out.println(vow);
		}
		else {
			con=con+1;
		}
	}
	System.out.println("vow:"+vow);
	System.out.println("cons:"+con);
}


}
