package introdution;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		
		DoNotTerminate.forbidExit();
		
		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			String s = String.valueOf(n);
			if (n == Integer.parseInt(s)) {
				System.out.println("Good Job");
			} else {
				System.out.println("Wrong answer.");
			}
			
		} catch(DoNotTerminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!!");
		}
	}
}

class DoNotTerminate {
	public static class ExitTrappedException extends SecurityException {	
	}
	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager(){
			public void checkPermission(java.security.Permission perm) {
				if(perm.getName().contains("exitVM")){
					throw new ExitTrappedException();
				}
			};
		};
		System.setSecurityManager(securityManager);
	}
}
