package StringClassMethood_7;

public class TrimMethod {

	public static void main(String[] args) {
		
//		String name = "	deepak panwar	";
//		System.out.println(name);
//		System.out.println(name.trim());
		
		String name = "		";
//		if(name.length()==0) {
//		if(name.trim().length()==0) {
		if(name.trim().isEmpty()) {
			System.out.println("name is empty");
		}else {
			System.out.println("valid name");
		}
		
	}

}
