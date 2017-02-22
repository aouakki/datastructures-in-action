package Graphs;

import java.util.*;

public abstract class Graph {

	private int numVertices;
	private int numEdges;

	public Graph() {
		this.numEdges = 0;
		this.numVertices = 0;
	}

	public int getNumVertices() {
		return numVertices;
	}

	public int getNumEdges() {
		return numEdges;
	}

	public void addVertex() {
		ImplementaddVertex();
		this.numVertices++;
	}

	public void addEdge(int vertex, int neighbor) {
		implementaddEdge(vertex, neighbor);
		this.numEdges++;
	}

	public abstract void implementaddEdge(int vertex, int neighbor);

	public abstract void ImplementaddVertex();

	public abstract List<Integer> getNeighbors(int v);
}
