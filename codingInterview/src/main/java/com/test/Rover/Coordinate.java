package com.test.Rover;

public class Coordinate {

	private int x;
	private int y;
	private int compassPoint;
	
	Coordinate(int x,int y,int compassPoint){
		this.x =x ;
		this.y =y;
		this.compassPoint = compassPoint;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getCompassPoint() {
		return compassPoint;
	}

	public void setCompassPoint(int compassPoint) {
		this.compassPoint = compassPoint;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
