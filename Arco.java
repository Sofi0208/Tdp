package Grafo;

public class Arco<String,Arco> {
	
	protected int node1; 
	protected int  node2;
	
	public Arco(int n1,int n2) { 
		node1=n1;
		node2=n2;
	}
	
	public int getNode1() {
		return node1;
	}
	
	public int getNode2() {
		return node2;
	}
	
	public void setNode1(int n1) {
		node1=n1;
	}
	
	public void setNode2(int n2) {
		node2=n2;
	}

}
