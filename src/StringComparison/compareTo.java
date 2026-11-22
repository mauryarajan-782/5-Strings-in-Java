package StringComparison;

public class compareTo {

	public static void main(String[] args) {
		
//		String s1 = "a";	//97
//		String s2 = "A";	//65
//		System.out.println(s1.compareTo(s2));			//output: 32		
		
//		String s1 = "a";	//97	
//		String s2 = "a";	//97
//		System.out.println(s1.compareTo(s2));			//output: 0
		
//		String s1 = "A";	//65
//		String s2 = "a";	//97
//		System.out.println(s1.compareTo(s2));			//output: -32
		
//		String s1 = "ab";	
//		String s2 = "Ab";
//		System.out.println(s1.compareTo(s2));			//output: 32
		
//		String s1 = "Ab";	
//		String s2 = "AB";
//		System.out.println(s1.compareTo(s2));			//output: 32
		
//		String s1 = "aB";	
//		String s2 = "aB";
//		System.out.println(s1.compareTo(s2));			//output: 0
		
//		String s1 = "aB";	
//		String s2 = "aC";
//		System.out.println(s1.compareTo(s2));			//output: -1
		
		String s1 = "aB";	
		String s2 = "ab";
		System.out.println(s1.compareTo(s2));			//output: -32
	}

}