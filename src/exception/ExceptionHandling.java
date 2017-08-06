package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x/y);
		} catch(InputMismatchException e) {
			System.out.println(e.getClass().getName());
		} catch (ArithmeticException a) {
			System.out.println(a.getClass().getName() + ": / by zero");
		}
	}
}
