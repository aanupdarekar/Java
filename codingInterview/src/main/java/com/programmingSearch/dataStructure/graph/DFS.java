package com.programmingSearch.dataStructure.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
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

		System.out.println("DFS recursion");
		dfsRecursion(v1);

		Vertex v11 = new Vertex(1);
		Vertex v21 = new Vertex(2);
		Vertex v31 = new Vertex(3);
		Vertex v41 = new Vertex(4);
		Vertex v51 = new Vertex(5);
		v11.setNeighbour(v31);
		v11.setNeighbour(v21);
	
		v31.setNeighbour(v41);
		v41.setNeighbour(v51);
		dfsstack(v11);
	}


	private static void dfsstack(Vertex v) {
		Stack<Vertex> stack = new Stack();
		stack.add(v);
		v.setVisited(true);

		while (!stack.isEmpty()) {

			Vertex vertex = stack.pop();
			System.out.println("vertex " + vertex.getData());

			vertex.getNeighbour().forEach((vi) -> {
				if (!vi.isVisited()) {
					vi.setVisited(true);
					stack.push(vi);
				}
			});
		}
	}

	private static void dfsRecursion(Vertex root) {

		root.setVisited(true);
		System.out.println(" " + root.getData());

		root.getNeighbour().forEach((v) -> {
			if (!v.isVisited()) {

				// if i set it outside and if iadd v2.setNeighbour(v4);
				// then it will add the value in queue even though its
				// visited
				v.setVisited(true);

				// if its not visited call it recursively
				dfsRecursion(v);
			}
		});
		// need to check

	}
}
