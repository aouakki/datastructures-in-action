package Graphs;

import java.util.*;

import javax.management.Query;

public class GraphAdjList extends Graph {

	// structure to hold vertices with correspondent edges ;
	private Map<Integer, ArrayList<Integer>> adjLists;

	public GraphAdjList() {
		this.adjLists = new HashMap<Integer, ArrayList<Integer>>();
	}

	@Override
	public void ImplementaddVertex() {
		int v = getNumVertices();
		ArrayList<Integer> neighbors = new ArrayList<Integer>();
		adjLists.put(v, neighbors);

	}

	@Override
	public List<Integer> getNeighbors(int v) {
		ArrayList<Integer> neighbors = adjLists.get(v);
		return neighbors;
	}

	@Override
	public void implementaddEdge(int vertex, int neighbor) {
		ArrayList<Integer> neighbors = adjLists.get(vertex);
		neighbors.add(neighbor);
		adjLists.put(vertex, neighbors);
	}
}
