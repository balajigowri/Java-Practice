package javapractice;

public class Stringtypes {

	public static void main(String[] args) {
		String s = "Balaji";
		String s2="Balaji";
		System.out.println("Address of s:"+System.identityHashCode(s));
		System.out.println("Address of s2:"+System.identityHashCode(s2));
		s = s.concat(s2);
	  // We can modify the value but i can't modify the memory because
     //this is imumutable string
		System.out.println("After Concat of s Address:"+"\n"+s);
		System.out.println("Address of s:"+System.identityHashCode(s));
		
		String s3 = new String("Soundravel");
		String s4 = new String("Soundravel");
		System.out.println("Nonliteral string");
		
		System.out.println("Address of s3:"+System.identityHashCode(s3));
		System.out.println("Address of s4:"+System.identityHashCode(s4));
		 s3 = s3.concat(s4);
		 System.out.println("After Concat of s Address"+System.identityHashCode(s3));
		
		 
		StringBuffer s5 = new StringBuffer("Gowri");
		StringBuffer s6 = new StringBuffer("Gowri");
		 System.out.println("Address of s5"+"\n"+System.identityHashCode(s5));
		 System.out.println("Address of s6"+"\n"+System.identityHashCode(s6));
		s5=s5.append(s6);
		System.out.println("after Append"+"\n"+s5);
		 System.out.println("After append of s5 Address"+"\n"+System.identityHashCode(s5));
		
	}

}
