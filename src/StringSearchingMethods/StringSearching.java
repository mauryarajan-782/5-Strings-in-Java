package StringSearchingMethods;

public class StringSearching {

	public static void main(String[] args) {
		
		String s = "deepak";
		
		System.out.println(s.indexOf("e"));					//1
		System.out.println(s.lastIndexOf("e"));				//2
		System.out.println(s.charAt(3));					//p
		System.out.println(s.contains("e"));				//true
		System.out.println(s.startsWith("ee"));				//false
		System.out.println(s.endsWith("ak"));				//true
	}

}