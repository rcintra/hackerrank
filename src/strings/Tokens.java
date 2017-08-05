package strings;

import java.util.Scanner;

public class Tokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s = s.trim();
		// Write your code here.
		//String[] split = s.split("[\\s@&.?$+-]+");
		//String[] split = s.split("[^a-zA-Z0-9]");
		String[] split = s.split("[^a-zA-Z0-9]+");
		if (split.length > 0) {
			if (!split[0].equals("")) { 
				System.out.println(split.length);
				for (String str : split) {
					System.out.println(str);
				}
			} else {
				System.out.println(0);
			}
		} else {
			System.out.println(0);
		}
		scan.close();
	}

}
