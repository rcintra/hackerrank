package biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		System.out.println(
				n.isProbablePrime(1) ? "prime" : "not prime");
	}
}
