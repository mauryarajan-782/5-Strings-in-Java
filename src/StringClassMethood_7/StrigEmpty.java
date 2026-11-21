package StringClassMethood_7;

public class StrigEmpty {

	public static void main(String[] args) {
		
//		String name = "abc";
//		String name = "";
//		String name = null;
		String name = "   ";
		
		int i = name.length();
		if( i == 0) {
			System.out.println("name is empty");
		}else {
			System.out.println("valid name");
		}
	}

}