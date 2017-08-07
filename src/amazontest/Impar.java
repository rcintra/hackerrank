package amazontest;

public class Impar {

	public static void main(String[] args) {
		int[] y = oddNumbers(3,9);
		for (int i : y) {
			System.out.println(i);
		}
	}
	
	static int[] oddNumbers(int l, int r) {		
		int x = 0;
		int t = l;
		while (t<=r) {
			if (t%2!=0) {
				x++;
			}
			t++;
		}
		
		int[] res = new int[x];
		x=0;
		while (l<=r) {
			if (l%2!=0) {
				res[x++] = l;
			}
			l++;
		}
		return res;
    }
}
