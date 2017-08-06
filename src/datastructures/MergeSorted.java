package datastructures;

public class MergeSorted {

	public static void main(String[] args) {
		int[] r = sortedArrayMerge(new int[]{1,2,3},new int[]{6,5,4});
		for (int i : r) {
			System.out.println(i);
		}
	}
	
	static int[] sortedArrayMerge(int[] a, int[] b) {
		int[] result = new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if (a[i]<b[j]) {
				result[k++] = a[i];
				i++;
			} else {
				result[k++] = b[j];
				j++;
			}
		}
		while(i<a.length) {
			result[k++] = b[i++];
		}
		while(j<b.length) {
			result[k++] = b[j++];
		}
		bubbleSort(result);
		return result;
	}
	
	static void bubbleSort(int ar[]) {
	   for (int i = (ar.length - 1); i >= 0; i--) {
	      for (int j = 1; j <= i; j++) {
	         if (ar[j-1] > ar[j]) {
	              int temp = ar[j-1];
	              ar[j-1] = ar[j];
	              ar[j] = temp;
	         } 
	      } 
	   } 
	}

}
