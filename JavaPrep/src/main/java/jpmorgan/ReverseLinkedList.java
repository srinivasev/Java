package jpmorgan;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aList = new LinkedList<>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		
		System.out.println(aList);
		Collections.reverse(aList);
		System.out.println(aList);
	}

}
