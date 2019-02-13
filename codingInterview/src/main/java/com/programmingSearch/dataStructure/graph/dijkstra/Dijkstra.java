package com.programmingSearch.dataStructure.graph.dijkstra;

import java.util.*;

public class Dijkstra {

	public static void main(String[] arg) {

		Dijkstra obj = new Dijkstra();

		// Create a new graph.
		Graph g = new Graph(5);


		g.addEdge(0 ,1, 4);
		g.addEdge(0 ,2 ,8);
		g.addEdge(1 ,3 ,5);
		g.addEdge(1 ,2 ,2);
		g.addEdge(2 ,3 ,5);
		g.addEdge(2 ,4 ,9);
		g.addEdge(3 ,4 ,4);

		// Calculate Dijkstra.
		obj.calculate(g.getVertex(0));

		// Print the minimum Distance.
		for (Vertex v : g.getVertices()) {
			System.out.print("Vertex - " + v + " , Dist - " + v.minDistance + " , Path - ");
			/*for (Vertex pathvert : v.path) {
				System.out.print(pathvert + " ");
			}*/
			System.out.println("" + v);
		}

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

			for (Edge neighbour : u.neighbours) {
				Double newDist = u.minDistance + neighbour.weight;

				if (neighbour.target.minDistance > newDist) {
					// Remove the node from the queue to update the distance
					// value.
					//queue.remove(neighbour.target);
					neighbour.target.minDistance = newDist;

			
					queue.add(neighbour.target);
				}
			}
		}
	}

}
