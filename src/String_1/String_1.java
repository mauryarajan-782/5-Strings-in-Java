package String_1;

public class String_1 {

	public static void main(String[] args) {
		
		String str1 = "Hello";	//By Using Literal(Heap(String Constant Pool))-->SCP is a special memory area.It does not allow duplicate objects.

		String str2 = new  String("Hello");	// By Using new keyword(Heap)
		
		System.out.println("str.concat(\"Guys\"):"+str1.concat("Guys"));
		
		System.out.println(str1);
	}

}