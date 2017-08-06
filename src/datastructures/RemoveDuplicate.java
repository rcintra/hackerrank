package datastructures;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] dupl = new int[]{1,2,3,4,5,1,2,3,4,5};
		int[] result = new int[dupl.length-1];
		int v = 0;
		for (int i=0;i<dupl.length;i++){
			boolean found = false;
			for(int j=0;j<result.length;j++){
				if (dupl[i]==result[j]) {
					found = true;
					break;
				}
			}
			if (!found) {
				result[v]=dupl[i];
				v++;
			}
		}
		
		for(int x : result) {
			System.out.println(x);
		}
		
		int[] ar = removeDuplicates(dupl);
		for(int x : ar) {
			System.out.println(x);
		}
	}
	
	public static int[] removeDuplicates(int[] arr) {

	    int end = arr.length;

	    for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end; j++) {
	            if (arr[i] == arr[j]) {                  
	                int shiftLeft = j;
	                for (int k = j+1; k < end; k++, shiftLeft++) {
	                    arr[shiftLeft] = arr[k];
	                }
	                end--;
	                j--;
	            }
	        }
	    }

	    int[] whitelist = new int[end];
	    for(int i = 0; i < end; i++){
	        whitelist[i] = arr[i];
	    }
	    return whitelist;
	}
}
