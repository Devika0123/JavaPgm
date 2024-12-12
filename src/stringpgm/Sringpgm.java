package stringpgm;

public class Sringpgm {

	public static void main(String[] args) {
		// String class
		
		//Concate
		String s="Hello";
		String s1="July Batch";
		String s2="Hello";
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		System.out.println(2+3+s+5+6);
		
		//Equals
		
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.equals(s2));
		
		//toupper and tolower
		
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//Length
		
		System.out.println(s1.length());
		
		//startwith and endwith
		
		System.out.println(s1.startsWith("July"));//true;
		System.out.println(s1.endsWith("batch"));//true
		
		//contains
		System.out.println(s1.contains("batch"));//true
		
		//trim
		
		String s3="     Welcome   ";
		String s4=s+s3;
		System.out.println(s4)	;
		String s5=s3.trim();
		System.out.println(s+s5);
		
		//replace
		
		String s6="God is Great";
		System.out.println(s6.replace("Great", "Love"));
		
		//substring
		
		System.out.println(s6.substring(7));
		System.out.println(s6.substring(0, 3));
		
		//split
		
		String s7="Hello luminar Technolab";
		String[] st=s7.split("");
		for(String e:st)
		{
			System.out.println(e);
		}
		//tocharArray
		
		String s8="Hello";
		s8.toCharArray();
		char[]c=s8.toCharArray();
		for(char ele:c)
		{
			System.out.println(ele);
		}
		
	}

}
