import java.util.ArrayList;
import java.util.PriorityQueue;

public class prims {
    public static class Edge{
        int scr;
        int des;
        int wt;
        public Edge(int scr,int des,int wt){
            this.scr=scr;
            this.des=des;
            this.wt=wt;
        }
    }
//    public static void create(ArrayList<Edge> graph[]){
//        for(int i=0;i<graph.length;i++){
//            graph[i]=new ArrayList<>();
//        }
//        graph[0].add(new Edge(0,1,10));
//        graph[0].add(new Edge(0,2,15));
//        graph[0].add(new Edge(0,3,30));
//
//        graph[1].add(new Edge(1,0,10));
//        graph[1].add(new Edge(1,3,40));
//
//        graph[2].add(new Edge(2,0,15));
//        graph[2].add(new Edge(2,3,50));
//
//        graph[3].add(new Edge(3,1,40));
//        graph[3].add(new Edge(3,2,50));
//
//
//    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));


    }
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair(int n,int d){
            this.node=n;
            this.dist=d;
        }


        @Override
        public int compareTo(Pair p2) {
            return  this.dist-p2.dist;
        }
    }

    // this algorithm is used to find the minimum spanning tree of any graph which means that u have to connect all the nodes of the graph without having a single cycle in the graph and with minimumcost of the edges
    public static void prims(ArrayList<Edge> graph[], int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[V];
        pq.add(new Pair(0,0));
        int mincost=0;
        while(!pq.isEmpty()){
           Pair curr=pq.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                mincost+= curr.dist;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    if(!vis[e.des]){
                        pq.add(new Pair(e.des,e.wt));
                    }
                }
            }
        }
        System.out.println("The cost of the MST "+mincost);
    }

    public static void main(String[] args) {
        int V=6;

        ArrayList<Edge> graph[] = new ArrayList[V];
         create(graph);
        prims(graph,V);
    }
}
