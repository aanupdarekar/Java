package com.programmingSearch.dataStructure.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BFS {
	public static void main(String args[]) {

		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);

		v1.setNeighbour(v2);
		v1.setNeighbour(v4);
		v2.setNeighbour(v3);
		v2.setNeighbour(v4);
		v4.setNeighbour(v2);
		v4.setNeighbour(v5); 
		bfs(v1);

	}

	private static void bfs(Vertex root) {

		// create queue to add the vertex
		Queue<Vertex> queue = new LinkedList();
		queue.add(root);
		root.setVisited(true); 
		// loop through queue till its empty
		while (!queue.isEmpty()) {

			// fetch the vertex
			Vertex vertex = queue.remove();

			System.out.println(" " + vertex.getData());
			
			vertex.getNeighbour().forEach((v) -> {
				if (!v.isVisited()) {

					// if i set it outside and if iadd bfs2.setNeighbour(bfs4);
					// then it will add the value in queue even though its
					// visited
					v.setVisited(true);
					queue.add(v);
					

				}
			});

		}

	}
	
	

}
