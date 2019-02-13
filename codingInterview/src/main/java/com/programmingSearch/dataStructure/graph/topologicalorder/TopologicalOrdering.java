package com.programmingSearch.dataStructure.graph.topologicalorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {

	private Stack<Vertex> stack;

	public TopologicalOrdering() {
		this.stack = new Stack<>();
	}

	public void dfs(Vertex vertex) {
		vertex.setVisited(true);

		for (Vertex v : vertex.getNeighbourList()) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfs(v);
			}

		}

		stack.push(vertex);
	}

	public Stack<Vertex> getStack() {
		return stack;
	}

	public static void main(String[] args) {

		TopologicalOrdering to = new TopologicalOrdering();
		

		Vertex v0 = new Vertex("0");
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");

		List<Vertex> list = new ArrayList();
		list.add(v2);
		list.add(v0);
		list.add(v1);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		
		v2.addNeighbour(v3);
		v3.addNeighbour(v1);
		v4.addNeighbour(v0);
		v4.addNeighbour(v1);
		v5.addNeighbour(v0);
		v5.addNeighbour(v2);

	

		for (Vertex vertex : list) {
			if (!vertex.isVisited()) {
				to.dfs(vertex);
			}
		}

		//to print the stack
		Stack<Vertex> stack = to.getStack();
		for (int i = 0; i < list.size(); i++) {

			Vertex vertex = stack.pop();
			System.out.println(vertex + " ->");
		}

	}

}
