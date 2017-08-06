package datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);
		for (int i = 0; i < m; i++) {
			String ope = in.next();
			int b1orB2 = in.nextInt(); 
			int index = in.nextInt();
			/*if (ope.equalsIgnoreCase("AND")) {
				if (b1orB2 == 1) b1.and(b2);
				else b2.and(b1);
			} else if (ope.equalsIgnoreCase("OR")) {
				if (b1orB2 == 1) b1.or(b2);
				else b2.or(b1);
			} else if (ope.equalsIgnoreCase("SET")) {
				if (b1orB2 == 1) b1.set(index);
				else b2.set(index);
			} else if (ope.equalsIgnoreCase("FLIP")) {
				if (b1orB2 == 1) b1.flip(index);
				else b2.flip(index);
			}*/
			if(ope.equals("AND")){
                if(b1orB2==1) b1.and(b2);
                else b2.and(b1);
            }else if(ope.equals("OR")){
               if(b1orB2==1) b1.or(b2);
                else b2.or(b1);
            }else if(ope.equals("XOR")){
                if(b1orB2==1) b1.xor(b2);
                else b2.xor(b1);
            }else if(ope.equals("FLIP")){
                if(b1orB2==1) b1.flip(index);
                else b2.flip(index);
            }else if(ope.equals("SET")){
               if(b1orB2==1) b1.set(index);
                else b2.set(index);
            }
			System.out.println(b1.cardinality() + " " + b1.cardinality());			
		}
	}
}
