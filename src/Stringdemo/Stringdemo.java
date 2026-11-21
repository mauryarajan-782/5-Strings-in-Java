package Stringdemo;

public class Stringdemo {
	
	public static void main(String[]args) {
		
//		String s2 = new String();					//No arg constructor empty object create
//		System.out.println(s2.length());
		
//		String s2 = new String("deepak");			//String(original) output : 6
//		System.out.println(s2.length());
		
//		StringBuffer sb=new StringBuffer("deepak");	//StringBuffer&StringBuilder-output:6
//		String s2 = new String(sb);			
//		System.out.println(s2);
		
//		byte[] b = {101,102,103}; 					//byte-output:6
//		String s2 = new String(b);			
//		System.out.println(s2);
		
//		char[] c = {'a','b','c'}; 					//char-output:6
//		String s2 = new String(c);			
//		System.out.println(s2);
		
		char[] s1 = new char[]{'a','b','c'}; 		//char-output:s1:- [C@1dbd16a6
		String s2 = new String("abc");							//s2:- abc
		
		System.out.println("s1 :- "+s1);
		System.out.println("s2 :- "+s2);
			
	}

}