package com.programmingSearch.dataStructure.TSP;

public class SimulatedAnnealing {

	
	private SingleTour best;
	
	public void simulation(){
		
		double temperature = 10000;
		double coolingRate = 0.003;

		SingleTour currentSolution = new SingleTour();
		currentSolution.generateIndividualTour();

		System.out.println("Initial solution distance: " + currentSolution.getDistance());

		best = new SingleTour(currentSolution.getTour());

		while (temperature > 1) {
			
			SingleTour newSolution = new SingleTour(currentSolution.getTour());

			int travelPosition1 = (int) (newSolution.getTour().size() * Math.random());
			City firstCityToSwap = newSolution.getCity(travelPosition1);
			
			int travelPosition2 = (int) (newSolution.getTour().size() * Math.random());
			City secondCityToSwap = newSolution.getCity(travelPosition2);

			newSolution.setCity(travelPosition2, firstCityToSwap);
			newSolution.setCity(travelPosition1, secondCityToSwap);

			double currentEnergy = currentSolution.getDistance();
			double neighbourEnergy = newSolution.getDistance();

			if (acceptanceProbability(currentEnergy, neighbourEnergy, temperature) > Math.random()) {
				currentSolution = new SingleTour(newSolution.getTour());
			}

			if (currentSolution.getDistance() < best.getDistance()) {
				best = new SingleTour(currentSolution.getTour());
			}

			temperature *= 1 - coolingRate;
		}

	}
	
	public double acceptanceProbability(double currentEnergy, double neighbourEnergy, double temperature) {
		
		if (neighbourEnergy < currentEnergy) {
			return 1;
		}
		
		return Math.exp((currentEnergy - neighbourEnergy) / temperature);
	}

	public SingleTour getBest() {
		return best;
	}
	
	
}
