package strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		
		String palindrome = "";
		for(int i = A.length()-1; i>=0; i--) {
			palindrome = palindrome + A.charAt(i);
		}

		if (palindrome.equals(A)) System.out.println("Yes");
		else System.out.println("No");
			
	}
}
