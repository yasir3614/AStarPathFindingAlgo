// Java Program to demonstrate adjacency list  
// representation of graphs 
package pathfindingastar;
import java.io.*; 
import java.util.*; 
import java.util.LinkedList; 
  
public class PathFindingAStar {
    static class Edge {
        int source;
        int destination;
        
        String source_;
        String destination_;
        
        int weight;
        
        public Edge(int source, int destination, int weight) {
            this.source_=returnCityIndex(source);
            this.destination_=returnCityIndex(destination);
            
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        
        int vertices;
        public LinkedList<Edge> [] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
             adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination, int weight) {
            
            
            Edge edge = new Edge(source, destination, weight);
            Edge edge_2= new Edge(destination,source,weight);
            adjacencylist[source].addFirst(edge); //for directed graph
            adjacencylist[destination].addFirst(edge_2); //for directed graph
        }

        public void printGraph(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                   
                    System.out.println((list.get(i).source_ + " is connected to " +
                            (list.get(j).destination_) + " with weight " +  list.get(j).weight));
                }
            }
        }
        
    }
    
    public static int returnCity(String city){
        
    switch(city){
        case "oradea":
            
            return 0;           
        case "neamt":
             
            return 1;
        case "zerind":
            return 2;
        case "iasi":
            return 3;
        case "arad":
            return 4;
        case "sibiu":
            return 5;
        case "fagaras":
            return 6;
        case "vaslui":
            return 7;
        case "timi":
            return 8;
        case "rimnicu":
            return 9;
        case "lugoj":
            return 10;
        case "pitesti":
            return 11;
        case "urziceni":
            return 12;
        case "hirosova":
            return 13;
        case "mehadia":
            return 14;
        case "bucharest":
            return 15;
        case "dobreta":
            return 16;
        case "craiova":
            return 17;
        case "giurgiu":
            return 18;
        case "eforie":
            return 19;
            
    }
        return 999;
    
    };
    
		 public static String returnCityIndex(int city){
				
			switch(city){
				
					case 0:           
				return "oradea";
					case 1:
				return "neamt";
					case 2:
			   return "zerind";
					case 3:
				 return "iasi";
					case 4:
				return "arad";
					case 5:
			   return "sibiu";
					case 6:
				 return "fagaras";	
					case 7:
				return "vaslui";
					case 8:
				return "timi";
					case 9:
				return "rimnicu";
					case 10:
				return "lugoj";
					case 11:
				return "pitesti";
					case 12:
				return "urziceni";
					case 13:
				return "hirosova";
					case 14:
				return "mehadia";
					case 15:
				return "bucharest";
					case 16:
				return "dobreta";
					case 17:
				return "craiova";
					case 18:
                                return "giurgiu";
					case 19:
                                return "eforie";
                                
					
			}
				
			return "None";
			}
			
                        
      public static void main(String[] args) {
          
            Stack myStack = new Stack();
            
            int vertices = 20;
            Graph graph = new Graph(vertices);
            
            graph.addEgde(returnCity("oradea"), returnCity("zerind"), 71);
            graph.addEgde(returnCity("oradea"), returnCity("sibiu"), 151);
            
            graph.addEgde(returnCity("neamt"), returnCity("iasi"), 87);
            
            graph.addEgde(returnCity("zerind"), returnCity("arad"), 75);
            
            graph.addEgde(returnCity("iasi"), returnCity("vaslui"), 92);
            
            graph.addEgde(returnCity("arad"), returnCity("sibiu"), 140);
            
            graph.addEgde(returnCity("oradea"), returnCity("timi"), 118);
            
            graph.addEgde(returnCity("sibiu"), returnCity("fagaras"), 99);
            graph.addEgde(returnCity("sibiu"), returnCity("rimnicu"), 80);
            
            graph.addEgde(returnCity("fagaras"), returnCity("bucharest"), 211);
            
            graph.addEgde(returnCity("vaslui"), returnCity("urziceni"), 142);
            
            graph.addEgde(returnCity("timi"), returnCity("lugoj"), 111);
            
            
            graph.addEgde(returnCity("rimnicu"), returnCity("pitesti"),97);
            graph.addEgde(returnCity("rimnicu"), returnCity("craiova"), 146);
            
            graph.addEgde(returnCity("pitesti"), returnCity("bucharest"), 101);
            graph.addEgde(returnCity("pitesti"), returnCity("craiova"), 138);
            
            graph.addEgde(returnCity("bucharest"), returnCity("giurgiu"), 90);
            graph.addEgde(returnCity("bucharest"), returnCity("urziceni"),85);
            
            graph.addEgde(returnCity("urziceni"), returnCity("hirosova"),98);
            
            graph.addEgde(returnCity("hirosova"), returnCity("eforie"), 80);   
            
            graph.addEgde(returnCity("mehadia"), returnCity("dobreta"), 75);
            
            graph.addEgde(returnCity("dobreta"), returnCity("craiova"), 120);
            graph.printGraph();
           

//            myStack.push(graph.adjacencylist[0].get(0).source);
//            System.out.println(myStack.pop());
            
        }
}