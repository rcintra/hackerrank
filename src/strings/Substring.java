package strings;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        // --- First
        //System.out.println(S.substring(start, end)); 
        
        // OR

        // --- Second
        /*String str="";
        for(int i=start;i<end;i++){
            str += S.charAt(i);
        }
        System.out.println(str);*/

        
        // --- Three
        for(int i=start;i<end;i++){
            System.out.print(S.charAt(i));
        }
	}
}
