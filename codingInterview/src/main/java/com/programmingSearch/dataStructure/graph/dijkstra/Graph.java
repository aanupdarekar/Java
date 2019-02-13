package com.programmingSearch.dataStructure.graph.dijkstra;

import java.util.*;

public class Graph {
	private ArrayList<Vertex> vertices;

	public Graph(int numberVertices) {
		vertices = new ArrayList<Vertex>(numberVertices);
		for (int i = 0; i < numberVertices; i++) {
			vertices.add(new Vertex("v" + Integer.toString(i)));
		}
		
	}

	public void addEdge(int src, int dest, int weight) {
		Vertex s =getVertex(src);
		Edge new_edge = new Edge(vertices.get(dest), weight);
		s.neighbours.add(new_edge);
	}

	public ArrayList<Vertex> getVertices() {
		return vertices;
	}

	public Vertex getVertex(int vert) {
		return vertices.get(vert);
	}
}
