package com.test.Rover;

/**
 * @author Anup Darekar
 *
 */
public class DirectionReceiver {

	private int north = 1;
	private int east= 2;
	private int south = 3;
	private int west = 4;
	
	Coordinate coordinate;
	public DirectionReceiver(Coordinate coordinate){
		this.coordinate = coordinate;
	}
	
	/*
	 * Method to move the coordinates
	 * */
	public void moveCoordinates() {
		
		//if its pointing to north increase y coordinate
		if (coordinate.getCompassPoint() == north) {
			coordinate.setY(coordinate.getY() + 1);
		
		} 
		//if its pointing to east increase x coordinate
		else if (coordinate.getCompassPoint() == east) {
			coordinate.setX(coordinate.getX() + 1) ;
		} 
		
		//if pointing to south decrease y coordinate
		else if (coordinate.getCompassPoint() == south) {
			coordinate.setY(coordinate.getY() - 1);
		} 
		//if pointing to west descrese x coordinate
		else if (coordinate.getCompassPoint() == west) {
			coordinate.setX(coordinate.getX() -1 );
		}
	}
	
	
	public void turnLeft() {
		int point = coordinate.getCompassPoint();
		point = point -1;
		
		if(point < north){
			point = west;
		}
		
		coordinate.setCompassPoint(point);
	}
	
	//command execute
	public void turnRight() {
		int point = coordinate.getCompassPoint();
		point = point +1;
		
		if(point > west){
			point = north;
		}
		
		coordinate.setCompassPoint(point);
	}
	public void printCoordinateDirection() {
		
		char direction;
		int point = coordinate.getCompassPoint();
		switch(point){
		case 1 :
			direction = 'N';
			break;
		case 2 :
			direction = 'E';
			break;    			
		case 3 :
			direction = 'S';
			break;
		case 4 :
			direction = 'W';
			break;
		default :
			direction ='N';
			break;
		}
		
		System.out.println(coordinate.getX()+ "  "+coordinate.getY()+" " +direction);
		
		
	}
		
	
}
