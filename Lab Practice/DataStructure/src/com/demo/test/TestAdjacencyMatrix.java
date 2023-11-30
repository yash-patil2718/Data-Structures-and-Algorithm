package graph.demo.test;

import graph.demo.beans.AdjecencyMatrix;

public class TestAdjacencyMatrix {

	public static void main(String[] args) {
		AdjecencyMatrix am = new AdjecencyMatrix(5);
		am.addEdge(1, 2, 10);
		am.addEdge(2, 3, 5);
		am.addEdge(3, 4, 3);
		am.addEdge(3, 5, 7);
		am.addEdge(4, 5, 5);
		am.addEdge(1, 4, 4);
		System.out.println(am);
	}

}
