package StringBufferDemo;

public class StringCapacity {

	public static void main(String[] args) {
		
//		StringBuffer sb=new StringBuffer("deepak");
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());				//16 + String length
		
		sb.append("hello");
		System.out.println(sb.capacity());				//16
		
		sb.append("deepak javaa");
		System.out.println(sb.capacity());				//34 (16*2+2) (old capacity+1)*2
														//(34*2)+2 = 70
		
	}

}
