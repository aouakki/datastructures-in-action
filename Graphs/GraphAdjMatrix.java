package Graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjMatrix extends Graph {
	private int[][] adjMatrix;

	public void implementAddEdge(int w, int v) {
		adjMatrix[w][v] = 1;
	}

	@Override
	public void ImplementaddVertex() {
		int v = getNumVertices();
		int newAdjMatrix[][] = new int[v * 2][v * 2];
		if (v >= adjMatrix.length) {
			for (int i = 0; i < adjMatrix.length; i++) {
				for (int j = 0; j < adjMatrix.length; j++) {
					newAdjMatrix[i][j] = adjMatrix[i][j];
				}
			}
		}
		adjMatrix = newAdjMatrix;

		for (int i = 0; i < adjMatrix.length; i++) {
			adjMatrix[v][i] = 0;
		}
	}

	@Override
	public List<Integer> getNeighbors(int v) {
		List<Integer> neighbors = new ArrayList<>();
		for (int i = 0; i < adjMatrix.length; i++) {
			if (adjMatrix[v][i] > 0)
				neighbors.add(i);
		}
		return neighbors;
	}

}
