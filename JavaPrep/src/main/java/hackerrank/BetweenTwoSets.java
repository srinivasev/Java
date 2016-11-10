package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
    	int xLowRange = 0;
    	int xHighRange = 0;
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a_i == n-1){
            	xLowRange = a[a_i];
            }
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(b_i == m-1){
            	xHighRange = b[b_i];
            }
        }
        
        List<Integer> xNumbers = new ArrayList();
        for(int x=xLowRange;x<=xHighRange;x++){
        	if(isFactorofVarx(x,a) && findFactorBoolean(x,b)){
        		xNumbers.add(x);
        	}
        }
        
        System.out.println(xNumbers.size());
    }

	private static boolean findFactorBoolean(int x, int[] b) {
		// TODO Auto-generated method stub
		int counter = 0;
		for(int bVal:b){
			if(bVal % x == 0){
				counter++;
			}
		}
		if(counter==b.length){
			return true;
		}
		return false;
	}

	private static boolean isFactorofVarx(int x, int[] a) {
		// TODO Auto-generated method stub
		int counter = 0;
		for(int aVal:a){
			if(x % aVal==0){
				counter++;
			}
		}
		if(counter == a.length){
			return true;
		}
		return false;
	}
}
