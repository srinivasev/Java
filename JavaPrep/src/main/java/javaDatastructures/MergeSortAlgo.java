package javaDatastructures;

public class MergeSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//perform merge sort
		
		//5,6,1,2,10,9,3,7,4
		int arr[] = new int[]{5,6,1,2,10,7};
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		performMergeSort(arr,low,mid);
		performMergeSort(arr,mid+1,high);
		
	}

	private static void performMergeSort(int[] arr, int pos1, int pos2) {
		// TODO Auto-generated method stub
		
	}
}
