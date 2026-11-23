package StringAdditionSubstring;

public class StringAdditionSubstring {

	public static void main(String[] args) {
		
		String s1 = "deepak";
		String s2 = " java";
		
		System.out.println(s1+s2);			//deepakjava
		System.out.println(s1+10);			//deepak10
		System.out.println(s1+10+20);		//deepak1020
		System.out.println(10+s1+20);		//10deepak20
		System.out.println(10+20+s1);		//30deepak
		System.out.println(s1+20/10);		//deepak2
		System.out.println(s1+20*10);		//deepak200
//		System.out.println(s1+10-20);		//error dega
		
		//concate method
		System.out.println(s1.concat(s2));		//deepak java
		
		//join method
		System.out.println(String.join(",", s1,s2));			//deepak, java
	}

}