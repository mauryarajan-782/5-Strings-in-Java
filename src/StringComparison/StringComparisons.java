package StringComparison;

public class StringComparisons {

	public static void main(String[] args) {
		
//		String s1 = "deepak";
//		String s2 = "amit";
//		System.out.println(s1.equals(s2));			// output: false
		
//		String s1 = "deepak";						// same name output: true
//		String s2 = "deepak";
//		System.out.println(s1.equals(s2));
		
//		String s1 = "deepak";						// lower case
//		String s2 = "Deepak";						// upper case output: false
//		System.out.println(s1.equals(s2));
		
//		String s1 = "deepak";						
//		String s2 = "DEEPAK";						
//		System.out.println(s1.equalsIgnoreCase(s2));		//output: true
		
//		String s1 = "deepak";						
//		String s2 = "amit";						
//		System.out.println(s1.equalsIgnoreCase(s2));		//output: false
		
//		String s1 = "deepak";						
//		String s2 = "amit";						
//		System.out.println(s1.equals(""));		//check empty output: false
		
//		String s1 = "";						
//		String s2 = "amit";						
//		System.out.println(s1.equals(""));		//check empty output: true
		
		String s1 = "";						
		String s2 = "amit";						
		if(s1.equals("")) {
			System.out.println("name cannot be empty");
		}else {
			System.out.println("valid name");
		}
		
		
	}

}