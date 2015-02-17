package com.prepare.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

	List<GraphEdge> listOfEdges;
	String stringValue;

	public GraphNode(String stringValue) {
		super();
		this.stringValue = stringValue;
		listOfEdges = new ArrayList<GraphEdge>();
	}

	public void addEdge( GraphEdge e){
		listOfEdges.add(e);
	}
	
	
	public List<GraphEdge> getListOfEdges() {
		return listOfEdges;
	}

	public void setListOfEdges(List<GraphEdge> listOfEdges) {
		this.listOfEdges = listOfEdges;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	

}
