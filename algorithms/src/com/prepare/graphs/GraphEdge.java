package com.prepare.graphs;

public class GraphEdge {

	GraphNode source;
	GraphNode destination;
	
	int weight;

	
	public GraphEdge(GraphNode source, GraphNode destination, int weight) {
		super();
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public GraphNode getSource() {
		return source;
	}

	public void setSource(GraphNode source) {
		this.source = source;
	}

	public GraphNode getDestination() {
		return destination;
	}

	public void setDestination(GraphNode destination) {
		this.destination = destination;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}
