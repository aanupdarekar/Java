package com.programmingSearch.dataStructure.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	
	private int data;
	private boolean visited;
	private List<Vertex> neighbour;
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	
	
	public Vertex(int data){
		this.data = data;
		neighbour = new ArrayList();
	}

	public List<Vertex> getNeighbour() {
		return neighbour;
	}

	public void setNeighbour(Vertex e) {
		this.neighbour.add(e);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public String toString() {
		return String.valueOf(this.data);
	}
	
}
