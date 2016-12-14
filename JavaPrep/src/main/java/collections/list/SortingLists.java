package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2);
	}
	
}


public class SortingLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> aList = new ArrayList<String>();
		aList.add("c");
		aList.add("b");
		aList.add("a");
		aList.add("d");
		
		Collections.sort(aList,new StringLengthComparator());
		
		for(String a:aList){
			System.out.println(a);
		}
	}

}
