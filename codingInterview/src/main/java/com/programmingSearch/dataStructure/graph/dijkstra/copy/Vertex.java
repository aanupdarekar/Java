package com.programmingSearch.dataStructure.graph.dijkstra.copy;

import java.util.*;

public class Vertex implements Comparable<Vertex> {
	public final String name;
	public int weight;
	public Map<Vertex,Integer> neighbours;
	public double minDistance = Double.POSITIVE_INFINITY;


	
	public int compareTo(Vertex other) {
		return Double.compare(minDistance, other.minDistance);
	}

	public Vertex(String name) {
		this.name = name;
		neighbours = new LinkedHashMap<Vertex,Integer>();
	}

	public void setNeighbourVertex(Vertex e,int weight) {
		this.neighbours.put(e,weight);
	}

	public String toString() {
		return name;
	}
}
