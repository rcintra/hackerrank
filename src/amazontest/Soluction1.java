package amazontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Soluction1 {
    // The first line of the input contains three decimal integers separated by space: 
    //			total number of drones ('D'), 
	// 			number of drones to be selected ('G') 
	// 			and number of drones in maintenance ('M').
    // The following 'D' lines each contains two decimal integers 
	// separated by space with information about each drone: 
	// ID and flight range in kilometers.
    // The following 'M' lines each contains the numeric ID 
	// of a drone currently in maintenance.
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);

        int numberOfDrones = in.nextInt();
        int numberOfRequiredDrones = in.nextInt();
        int numberOfDronesInMaintenance = in.nextInt();

        List<Drone> drones = new ArrayList<>();
        List<Integer> inMaintenanceDrones = new ArrayList<>();

        for(int i=0; i< numberOfDrones; i++) {
            drones.add(new Drone(in.nextInt(), in.nextInt()));
        }

        for(int i=0; i< numberOfDronesInMaintenance; i++) {
            inMaintenanceDrones.add(in.nextInt());
        }

        List<Integer> greatestFlightRangeDrones = greatestFlightRangeDrones(numberOfRequiredDrones, drones, inMaintenanceDrones);

        for(int i=0; i < greatestFlightRangeDrones.size(); i++) {
            System.out.println(greatestFlightRangeDrones.get(i));
        }*/
		List<Drone> drones = new ArrayList<>();
		drones.add(new Drone(4, 11));
		drones.add(new Drone(2, 15));
		drones.add(new Drone(5, 16));
		drones.add(new Drone(3, 40));
		drones.add(new Drone(1, 20));
		drones.add(new Drone(9, 60));
		drones.add(new Drone(6, 22));
		
		List<Integer> remover = new ArrayList<>();
		remover.add(1); remover.add(5); remover.add(9);
		
		List<Integer> dronesSelecionados = greatestFlightRangeDrones(3, drones, remover);
		for(Integer i : dronesSelecionados) {
			System.out.println(i);
		}
	}

	static List<Integer> greatestFlightRangeDrones(Integer numberOfRequiredDrones, List<Drone> drones, List<Integer> inMaintenanceDrones) {
		
		Iterator<Drone> remover = drones.iterator();
		while(remover.hasNext()) {
			Drone d = remover.next();
			for (Integer del : inMaintenanceDrones) {
				if (del.equals(d.getId()))
					remover.remove();
			}
		}
		
		Collections.sort(drones, new Comparator<Drone>() {
			@Override
			public int compare(Drone o1, Drone o2) {
				return o1.flightRange>o2.flightRange ? -1 : 1;
			}
		});

		List<Integer> retorno = new ArrayList<>();
		int i=0;
		while(i<numberOfRequiredDrones){
			retorno.add(drones.get(i).getId());
			i++;
		}
		
		return retorno;
    }

	private static class Drone {
		private int id;
		private int flightRange;
		public Drone(int id, int flightRange) {
			this.id = id;
			this.flightRange = flightRange;
		}
		public int getId() {
			return id;
		}
		public int getFlightRange() {
			return flightRange;
		}
	}
}

