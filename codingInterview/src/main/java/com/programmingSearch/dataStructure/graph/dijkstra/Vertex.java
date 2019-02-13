package com.programmingSearch.dataStructure.graph.dijkstra;

import java.util.*;

public class Vertex implements Comparable<Vertex> {
	public final String name;
	public ArrayList<Edge> neighbours;
	public double minDistance = Double.POSITIVE_INFINITY;

	public int compareTo(Vertex other) {
		return Double.compare(minDistance, other.minDistance);
	}

	public Vertex(String name) {
		this.name = name;
		neighbours = new ArrayList<Edge>();
	}

	public String toString() {
		return name;
	}
}
