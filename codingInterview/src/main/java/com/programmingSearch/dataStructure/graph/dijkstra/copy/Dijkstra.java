package com.programmingSearch.dataStructure.graph.dijkstra.copy;

import java.util.*;

import com.programmingSearch.dataStructure.graph.dijkstra.copy.*;;

public class Dijkstra {

	public static void main(String[] arg) {

		Dijkstra obj = new Dijkstra();


		Vertex v0 = new Vertex("0");
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		

		v0.setNeighbourVertex(v1,4);
		v0.setNeighbourVertex(v2,8);
		v1.setNeighbourVertex(v3,5);
		v1.setNeighbourVertex(v2,2);
		v2.setNeighbourVertex(v3,5);
		v2.setNeighbourVertex(v4,9);
		v3.setNeighbourVertex(v4,4);

		// Calculate Dijkstra.
		obj.calculate(v0);

		System.out.println(v0.minDistance);
		System.out.println(v1.minDistance);
		System.out.println(v2.minDistance);
		System.out.println(v3.minDistance);
		System.out.println(v4.minDistance);

	}

	public void calculate(Vertex source) {
		// Algo:
		// 1. Take the unvisited node with minimum weight.
		// 2. Visit all its neighbours.
		// 3. Update the distances for all the neighbours (In the Priority
		// Queue).
		// Repeat the process till all the connected nodes are visited.

		source.minDistance = 0;
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
		queue.add(source);

		while (!queue.isEmpty()) {

			Vertex u = queue.poll();

			for (Map.Entry<Vertex, Integer> neighbour : u.neighbours.entrySet()) {
				Double newDist = u.minDistance + neighbour.getValue();

				if (neighbour.getKey().minDistance > newDist) {
					// Remove the node from the queue to update the distance
					// value.
					//queue.remove(neighbour.target);
					neighbour.getKey().minDistance = newDist;

			
					queue.add(neighbour.getKey());
				}
			}
		}
	}

}
