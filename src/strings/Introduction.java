package strings;

import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"N":"Yes");
        System.out.print(String.valueOf(A.charAt(0)).toUpperCase());
        System.out.print(A.substring(1));
        System.out.print(" " + String.valueOf(B.charAt(0)).toUpperCase());
        System.out.println(B.substring(1));
	}
}
