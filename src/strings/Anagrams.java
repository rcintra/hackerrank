package strings;

import java.util.Scanner;

public class Anagrams {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
		
		if (a.length()!=b.length()) return false;
		
		for (int i = 0; i <= a.length() - 1; i++) {
			char char_a = a.charAt(i);
			int count_a = 0;
			
			for (int j = 0; j <= a.length() - 1; j++) {
				char char_aa = a.charAt(j);
				if (Character.toLowerCase(char_a) == Character.toLowerCase(char_aa)) count_a++; 
			}
			
			int count_b = 0;
			for (int k = 0; k <= b.length() - 1; k++) {
				if (Character.toLowerCase(char_a) == Character.toLowerCase(b.charAt(k))) count_b++;
			}
			
			if (count_a != count_b) return false;
			
		}
		
		return true;
		
    }

	public static void main(String[] args) {
	    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
