package amazontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soluction2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int tripMaxWeight = in.nextInt();
        int numberOfPackages = in.nextInt();

        int[] packagesWeight = new int[numberOfPackages];

        for (int i = 0; i < numberOfPackages; i++) {
            packagesWeight[i] = in.nextInt();
        }

        int minimumNumberOfTrips = minimumNumberOfTrips(tripMaxWeight, packagesWeight);

        System.out.println(minimumNumberOfTrips);
	}

	static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
		int qtd = 0;
		List<Integer> packages = new ArrayList<>();
		for (int index = 0; index < packagesWeight.length; index++) {
			packages.add(packagesWeight[index]);
		}
		
		Collections.sort(packages, Collections.reverseOrder());
		
		int sum = 0;
		int count = 0;
		for(Integer pkg : packages) {
			sum = sum + pkg;
			count++;
			if (sum>tripMaxWeight || count==2) { //add package
				qtd++;
				sum=pkg;
				count=0;
			}
		}
		
		if (sum!=0) qtd++;
		
		return qtd;
	}

}
