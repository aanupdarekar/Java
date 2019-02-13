package com.programmingSearch.dataStructure.TSP;

public class App {

	public static void main(String[] args) {
		/*for (int i = 0; i < 100; i++) {
					City city = new City();
					Repository.addCity(city);
		}*/
		
		City city = new City(40, 81);
		Repository.addCity(city);
		City city2 = new City(27, 17);
		Repository.addCity(city2);
		City city3 = new City(21, 23);
		Repository.addCity(city3);
		
		SimulatedAnnealing annealing = new SimulatedAnnealing();
		annealing.simulation();
		
		System.out.println("Final approximated solutions's distance is "+annealing.getBest().getDistance());
		System.out.println("Tour" +annealing.getBest());
	}
}
