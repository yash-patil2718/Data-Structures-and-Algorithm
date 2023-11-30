package graph.demo.beans;

public class AdjecencyList {
	SingleLinkedList[] graph;
	int vertices;
	
	public AdjecencyList(int vertices){
		this.vertices = vertices;
		graph = new SingleLinkedList[vertices];
		
		for(int i=0;i<graph.length;i++) {
			graph[i] = new SingleLinkedList();
		}
	}
	
	public void addEdge(int i, int j) {
		graph[i].addAtStart(j);
		graph[j].addAtStart(i);
	}
	
	public void removeEdge(int i, int j) {
		graph[i].remove(j);
		graph[j].remove(i);
	}
	
	public void displayData() {
		for(int i=0;i<graph.length;i++) {
			System.out.print(i+"----");
			graph[i].displaydata();
		}
	}
}	
	
	

