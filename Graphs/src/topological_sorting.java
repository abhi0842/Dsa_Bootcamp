import java.util.ArrayList;
import java.util.Stack;

public class topological_sorting {
    static class Edge{
        //Graphs can be store in many ways like in form of adjency list,2D array,list,implicit graphs etc but storing the Graphs in the form of adjancy list is most efficient one.
        //Also we store the edges in the list where we need  to sort the list like in the minimum spanning tree
        // There is two main method in the graphs traversal BFS(breadth first search )  ,DFS(depth first search)
        //G raphs does also have the disconnected components
        int scr;
        int weight;
        int des;
        public Edge(int scr,int des,int weight){
            this.des=des;
            this.weight=weight;
            this.scr=scr;
        }
        public Edge(int scr,int des){
            this.des=des;
            this.scr=scr;

        }
    }
    public static void create(ArrayList<graphs_1.Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new graphs_1.Edge(0,1));
        graph[0].add(new graphs_1.Edge(0,2));
        graph[1].add(new graphs_1.Edge(1,0));
        graph[1].add(new graphs_1.Edge(1,3));
        graph[2].add(new graphs_1.Edge(2,0));
        graph[2].add(new graphs_1.Edge(2,4));
        graph[3].add(new graphs_1.Edge(3,1));
        graph[3].add(new graphs_1.Edge(3,4));
        graph[3].add(new graphs_1.Edge(3,5));
        graph[4].add(new graphs_1.Edge(4,2));
        graph[4].add(new graphs_1.Edge(4,3));
        graph[4].add(new graphs_1.Edge(4,5));
        graph[5].add(new graphs_1.Edge(5,3));
        graph[5].add(new graphs_1.Edge(5,4));
        graph[5].add(new graphs_1.Edge(5,6));
        graph[6].add(new graphs_1.Edge(6,5));





    }
    //topological methord is the process of travering the directed acycylic graph in the graph
    //It is grapph traversing methord in which we traverse the nodes of the graph in such a order of dependency of each other
    //In topological graph traversal we traverse the graph in such a order that u->v if defines that u always comes first  then the v
//Topological sorting shows us the dependency (it means if we have to do any work then we must have to follow the systemetic path to complete the work in the prrocess
//topologicalsort uses stack in the graph to keep the track of the visited element in the and store them in the stack ans when we finally returning from the call it just adding the value of current in the stack and finally pop all the values till the stack is empty
    public static void helpertopsort(ArrayList<Edge>[] graph, boolean vis[], int curr, Stack<Integer> stack){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.des]){
                helpertopsort(graph,vis,e.des,stack);
            }
        }
        stack.push(curr);
    }
    public static void topsort(ArrayList<Edge> [] graph, int V){
        boolean vis[]=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                helpertopsort(graph,vis,i,stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ")  ;
        }

    }
}
