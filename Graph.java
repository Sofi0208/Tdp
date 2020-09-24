package Grafo;
import java.util.HashMap;
import Excepciones.*;
import TDALista.ListaDoblementeEnlazada;
import interfacesEnComun.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Graph{

	protected HashMap<Integer,Integer> nodos;
	protected HashMap<String,Arco> arcos; 
	protected static Logger logger;
	
	public Graph() {
		nodos= new HashMap<Integer,Integer>();
		arcos= new HashMap<String,Arco>(); 
		if(logger == null) {
			logger= Logger.getLogger(Graph.class.getName());
			Handler hnd= new ConsoleHandler();
			hnd.setLevel(Level.FINE);
			logger.addHandler(hnd);
			logger.setLevel(Level.WARNING);
			Logger LoggerRaiz= logger.getParent();
			for(Handler h: LoggerRaiz.getHandlers())
				h.setLevel(Level.OFF);
		}
	}
	
	public void addNode(int node) { 
		if(nodos.get(node)==null)
			nodos.put(node,node); 
		else 
			logger.info("El nodo ya pertenece al grafo");
	}
	
	public void addEdge(int node1, int node2) { 
		boolean estaN1=nodos.containsKey(node1); 
		boolean estaN2=nodos.containsKey(node2); 
		Arco<String,Arco> nuevo=new Arco<String,Arco>(node1,node2); 
		String key=node1+","+node2;
		Arco<String,Arco> value= arcos.put(key, nuevo); 
		if(value!=null)
		  logger.info("El arco ya pertenece al grafo"); 	
		else 
			if(!estaN1 || !estaN2)
				logger.warning("El nodo 1 o el nodo 2 no pertenece al grafo");
	}
	
	public void removeNode(int node) { 
		if(nodos.get(node)!=null)
			nodos.remove(node); 
		else 
			logger.info("El nodo no esta en el grafo");
		}
	
	public void removeEdge(int node1, int node2) { 
		Arco<String,Arco> nuevo=new Arco<String,Arco>(node1, node2); 
		String key;
		if(nodos.get(node1)!=null && nodos.get(node2)!=null) {
			Arco<String,Arco> a=arcos.remove(nuevo);  
			key=node1+","+node2;
			if(a==null)
				logger.warning("El arco no pertenece al grafo"); 
		}
		else 
			logger.warning("Los nodos no pertenecen al grafo");
	}
	
	
	
	
}