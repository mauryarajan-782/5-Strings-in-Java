package StringClassMethood_7;

public class IsEmpty {

	public static void main(String[] args) {
		
//		String name = "abc";
//		System.out.println(name.isEmpty());
		
		String name = "abc";
//		String name = "";
		boolean b = name.isEmpty();
		if(b==true) {
			System.out.println("name is empty");
		}else {
			System.out.println("valid name");
		}

	}

}
