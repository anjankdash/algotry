package com.prepare.graphs.traversal;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import com.prepare.graphs.GraphEdge;
import com.prepare.graphs.GraphNode;

public class BFSTraversal {

	Set<GraphNode> visitedSet =  new HashSet<GraphNode>();
	Queue<GraphNode> bfsRunningQueue =  new LinkedList<GraphNode>();
	
	public void BFS( GraphNode gNode){
		// 1. Make the node visited and add to the Queue
		if( !visitedSet.contains(gNode)){
			System.out.println( gNode.getStringValue() +  " --> " );
			visitedSet.add(gNode);
			bfsRunningQueue.add(gNode);
		}
		// 2. Add all child nodes to visited list 
		
		while(true){
			GraphNode nonVisitedChildNode =  findNonVisitedChildNode(gNode);
			if( nonVisitedChildNode == null){
			    break;
			}else{
				System.out.println( nonVisitedChildNode.getStringValue() +  " --> " );
				visitedSet.add(nonVisitedChildNode);
				bfsRunningQueue.add(nonVisitedChildNode);	
			}
		}
		
		if( bfsRunningQueue.isEmpty())
			return;
		else 
			BFS(bfsRunningQueue.remove());
		

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
