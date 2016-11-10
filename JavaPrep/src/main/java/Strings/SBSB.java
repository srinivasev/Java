package Strings;

public class SBSB {
	
	public static void main(String[] args) {
		
		String info = "";
		
		info+="My name is Bob.";
		info+=" and ";
		info+="i am a builder";
		
		System.out.println(info);
		
		StringBuilder sB = new StringBuilder();
		
		sB.append("hi ");
		sB.append("bye ");
		sB.append("good ");
		
		System.out.println(sB.toString());
	}
}
