package com.programmingSearch.dataStructure.graph.topologicalorder;

import java.util.*;

public class Vertex {
	public final String data;

	private boolean visited;
	private List<Vertex> neighbourList;

	public Vertex(String data) {
		this.data = data;
		this.neighbourList = new ArrayList<Vertex>();

	}

	public void addNeighbour(Vertex v){
		this.neighbourList.add(v);
	}
	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}


	public String toString() {
		return data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public String getData() {
		return data;
	}
	


	
}
