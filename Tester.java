package Grafo;

//import interfacesEnComun.PositionList;

public class Tester {
	public static void main(String[] args) {
		Graph grafo=new Graph(); 
       grafo.addNode(1);
       grafo.addNode(2);
       grafo.addNode(3);
       grafo.addNode(4);
       grafo.addNode(5);
       grafo.addEdge(2,4);
       grafo.addEdge(3,5);
       grafo.addEdge(4,5);
       
       //Funciona bien el addNode
       grafo.addNode(6);
       
       //Funciona mal el addNode*
       grafo.addNode(6);
       
       //Funciona mal el addEdge*
       grafo.addEdge(3,5);
       grafo.addEdge(6,7);
       
       //Funciona bien el removeNode
       grafo.removeNode(3);
       
       //Funciona mal el removeNode*
       grafo.removeNode(7);
       
       //Funciona bien el removeEdge
       grafo.removeEdge(4,5);
       
       //Funciona mal el removeEdge
       grafo.removeEdge(6,7);
       grafo.removeEdge(3,6);
	}
}