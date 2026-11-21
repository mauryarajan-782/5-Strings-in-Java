//Q1.Count total no of alphabets from a given String?
//Q2.Count total no of vowels from a given String?
//Q3.Count total no of small letters from a given String?
//Q4.Count total no of capital letters a given String?
//Q5.Count total no of words a given String?
//Q6.Count total no of small words a given String?
//Q7.Count total no of capital words a given String?
//Q8.Count total no of Proper words a given String?
		
		
package String_1;

public class String_2 {

	public static void main(String[] args) {
		
		String str = "Hello everyone we are from JAVA Full Stack Program";
		
		int letterCtr = 0;
		
		for(int i=0; i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(ch != ' ') {
				letterCtr++;
			}
			
			System.out.println(str.charAt(i));
		}
		
		System.out.println("Hi total letters are :"+ letterCtr);
	}
}