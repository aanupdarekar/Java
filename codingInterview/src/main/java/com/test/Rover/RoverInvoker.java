package com.test.Rover;

public class RoverInvoker {

	/** Assign integer value to compass point North */
	public static int N =1;
	
	/** Assign integer value to compass point East */
	public static int E = 2;
	
	/** Assign integer value to compass point South */
	public static int S = 3;
	
	/** Assign integer value to compass point West */
	public static int W = 4;
	
	private DirectionReceiver directionReceiver;
	
	RoverInvoker(DirectionReceiver directionReceiver){
		this.directionReceiver = directionReceiver;
	}
	
	/*
	 * Invoke the Direction based on command from user
	 * If command is L turnLeft
	 * If command is R turnRight
	 * If command is M move
	 * */
	public void invoke(String commands) {
		char c [] = commands.toCharArray();
		for (Character command : c) {
			if (command.equals('L')) {
				directionReceiver.turnLeft();
			} else if (command.equals('R')) {
				directionReceiver.turnRight();
			} else if (command.equals('M')) {
				directionReceiver.moveCoordinates();
			} 
		}
		
	}
	
	/**
	 * Print Rover position method
	 */
	public void printRoverPosition(){
		directionReceiver.printCoordinateDirection();
	}

	
	public static void main(String args[]) {
		
		Coordinate coordinate = new Coordinate(1,2,N);
	
		RoverInvoker roverInvoker = new RoverInvoker(new DirectionReceiver(coordinate));
		roverInvoker.invoke("LMLMLMLMM");
		roverInvoker.printRoverPosition();
		
		Coordinate coordinate2 = new Coordinate(3,3,E);		
		roverInvoker = new RoverInvoker(new DirectionReceiver(coordinate2));
		roverInvoker.invoke("MMRMMRMRRM");
		roverInvoker.printRoverPosition();
	}
}
