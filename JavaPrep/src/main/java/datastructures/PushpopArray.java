package datastructures;

public class PushpopArray {
	static String[] arr = new String[10];
	static int index = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push("a");
		push("b");
		push("c");
		push("d");
		
		pop();
		System.out.println(arr);
		for(String arrElements:arr){
			System.out.println(arrElements);
		}
	}

	private static void pop() {
		// TODO Auto-generated method stub
		arr[--index] = null;
	}

	private static void push(String string) {
		// TODO Auto-generated method stub
		arr[index++] = string;
	}
}
