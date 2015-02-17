package com.prepare.graphs.traversal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import com.prepare.graphs.GraphEdge;
import com.prepare.graphs.GraphNode;

public class DFSTraversal {

	Set<GraphNode> visitedSet =  new HashSet<GraphNode>();
	Stack<GraphNode> dfsRunningStack =  new Stack<GraphNode>();
	
	public void DFS( GraphNode gNode){
		// 1. Make the node visited and add to the stack
		if( !visitedSet.contains(gNode)){
			System.out.println( gNode.getStringValue() +  " --> " );
			visitedSet.add(gNode);
			dfsRunningStack.push(gNode);
		}
		// 2. Find the non visited child node of this node
		GraphNode nonVisitedChildNode =  findNonVisitedChildNode(gNode);
		
		// 3. If non visted child present then go ahead
		if( nonVisitedChildNode != null)
			DFS(nonVisitedChildNode);
		else{
			if( dfsRunningStack.isEmpty())
				return;
			DFS( dfsRunningStack.pop());
		}
			

	}
	
	
	private GraphNode findNonVisitedChildNode( GraphNode gNode){
		
		for( GraphEdge e : gNode.getListOfEdges()){
			if( visitedSet.contains(e.getDestination()) ){
				continue;
			}else{
				return e.getDestination();
			}
		}
		
		return null;
	}
}
