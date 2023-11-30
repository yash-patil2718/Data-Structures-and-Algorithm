package graph.demo.beans;

public class AdjecencyMatrix {
	int[][] adjmatrix;
	int vertices;
	int weight;
	
	AdjecencyMatrix(){
		vertices = 0;
		weight = 0;
	}
	
	public AdjecencyMatrix(int vertices){
		this.vertices = vertices;
		adjmatrix = new int[vertices][vertices];
	}
	
	public void addEdge(int row, int column,int weight) {
		adjmatrix[row-1][column-1] = weight;
		adjmatrix[column-1][row-1] = weight;
	}
	
	public void removeEdge(int row, int column) {
		adjmatrix[row-1][column-1] = 0;
		adjmatrix[column-1][row-1] = 0;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<adjmatrix.length;i++) {
			for(int j=0;j<adjmatrix[i].length;j++) {
				sb.append((adjmatrix[i][j])+"\t");
			}
			sb.append("\n");
		}
		return sb.toString();
		
	}
}
