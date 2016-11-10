package Strings;

public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String b = a.intern();
		
		System.out.println(b);
	}
}
