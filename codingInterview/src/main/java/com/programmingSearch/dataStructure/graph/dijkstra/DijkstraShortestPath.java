package com.programmingSearch.dataStructure.graph.dijkstra;

import java.util.Scanner;

/**
 * Below implementations is using adjacency matrix
 * https://www.youtube.com/watch?v=7GoDDj3onfI
 * https://www.youtube.com/watch?v=bImvsFNym9I
 * 
 * 
 *
5 7
0 1 4
0 2 8
1 3 5
1 2 2 
2 3 5
2 4 9
3 4 4
 * **/
public class DijkstraShortestPath {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int edges = s.nextInt();
		int adjMatrix[][] = new int[v][v];
		for (int i = 0; i < edges; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			int weight = s.nextInt();
			adjMatrix[v1][v2] = weight;
			adjMatrix[v2][v1] = weight;
		
		}
		dijkstra(adjMatrix);
	}

	private static void dijkstra(int[][] adjMatrix) {
		// fetch all the vertex
		int vertex = adjMatrix.length;

		// create variable for visited vertex
		boolean visited[] = new boolean[vertex];

		// create distance of each vertex array
		int distance[] = new int[vertex];

		// assign max distance value for each vertex
		for (int i = 0; i < vertex; i++) {
			distance[i] = Integer.MAX_VALUE;
		}

		// assign value of 0 for default vertex
		distance[0] = 0;
		

		for (int i = 0; i < vertex; i++) {
			int minVertex = findminDistanceVertex(visited, distance);
			visited[minVertex] = true;
			// visit the neighbour of vertex and check the distance
			for (int j = 0; j < vertex; j++) {

				// check in matrix if its neighbour by checking its weight and
				// by checking its not visited
				if (adjMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE) {

					int newdistance = distance[minVertex] + adjMatrix[minVertex][j];
					if (newdistance < distance[j] ) {
						distance[j] = newdistance;
					}
				}
			}
		}

		// Print
		for (int i = 0; i < vertex; i++) {
			System.out.println(i + " " + distance[i]);
		}

	}
	
	//Vertex should not be visited and distance should be minimum
	private static int findminDistanceVertex(boolean[] visited, int[] distance) {

		int minVertex = -1;
		for (int i = 0; i < distance.length; i++) {
			if (!visited[i]
					&& (minVertex == -1 || distance[i] < distance[minVertex])) {
				minVertex = i;
			}
		}
		// TODO Auto-generated method stub
		return minVertex;
	}
	
	

	private int findMinVertex(boolean[] visited, int[] distance) {
		// TODO Auto-generated method stub
		
		int minVertex =-1;
		for(int i=0;i<distance.length;i++){
			
			if(!visited[i] &&
					((minVertex==-1)||(distance[i]<distance[minVertex]))){
				minVertex =i;
			}
		}
		return minVertex;
	}
}
