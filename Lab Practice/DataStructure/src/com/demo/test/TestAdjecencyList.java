package graph.demo.test;

import graph.demo.beans.AdjecencyList;

public class TestAdjecencyList {

	public static void main(String[] args) {
		AdjecencyList al = new AdjecencyList(5);
		al.addEdge(0, 1);
		al.addEdge(0, 2);
		al.addEdge(1, 3);
		al.addEdge(2, 3);
		al.addEdge(2, 4);
		al.displayData();
		System.out.println();
		al.removeEdge(0, 2);
		al.displayData();
	}

}
