package com.prepare.graphs.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.prepare.graphs.GraphEdge;
import com.prepare.graphs.GraphNode;
import com.prepare.graphs.traversal.BFSTraversal;
import com.prepare.graphs.traversal.DFSTraversal;

public class GraphTest {
	
	GraphNode startNode;
	
	@Before	 
	public void setupTheGraph(){
		
		GraphNode nodeA = new GraphNode("A");
		GraphNode nodeB = new GraphNode("B");
		GraphNode nodeC = new GraphNode("C");
		GraphNode nodeD = new GraphNode("D");
		GraphNode nodeE = new GraphNode("E");
		GraphNode nodeF = new GraphNode("F");
		GraphNode nodeG = new GraphNode("G");
		GraphNode nodeH = new GraphNode("H");
		
		GraphEdge e1 =  new GraphEdge(nodeA, nodeB, 1);
		nodeA.addEdge(e1);
		
		GraphEdge e2 =  new GraphEdge(nodeB, nodeC, 1);
		GraphEdge e3 =  new GraphEdge(nodeB, nodeH, 1);
		nodeB.addEdge(e2);
		nodeB.addEdge(e3);
		
		GraphEdge e4 =  new GraphEdge(nodeC, nodeD, 1);
		GraphEdge e8 =  new GraphEdge(nodeC, nodeE, 1);
		nodeC.addEdge(e8);
		nodeC.addEdge(e4);
		
		
		
		GraphEdge e5 =  new GraphEdge(nodeH, nodeE, 1);
		nodeH.addEdge(e5);
		
		GraphEdge e6 =  new GraphEdge(nodeE, nodeF, 1);
		GraphEdge e7 =  new GraphEdge(nodeE, nodeG, 1);
		nodeE.addEdge(e6);
		nodeE.addEdge(e7);
		
		startNode = nodeA;
	}
	
	//@Test
	public void dfsTest() {
		
		DFSTraversal dfsTraversal = new DFSTraversal();
		
		dfsTraversal.DFS(startNode);
		assertEquals(true, true);
	}

	
	@Test
	public void bfsTest() {
		
		System.out.println(" ### BFS ###");
		BFSTraversal bfsTraversal = new BFSTraversal();
		
		bfsTraversal.BFS(startNode);
		assertEquals(true, true);
	}
	
	
	
	@After
	public void releaseResourcesGraph(){
		
	}
}
