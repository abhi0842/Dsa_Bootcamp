import java.util.ArrayList;
import java.util.PriorityQueue;


public class Dijkstraspa {
    //Dijkstra algorithm is a greedy type of algorithm which uses the breadth first search algorithm
    //Relaxation-relaxation means that if we have two nodes u and v from scr if u have to find the shortest path between source and destination then we calculated it as
    //if dis[u]+wt<des[v]{dis[v]=dis[u]+wt
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
    public static void dijkastra(ArrayList<Edge> graph[],int scr,int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
            int dist[]=new int[V];
            for(int i=0;i<dist.length;i++){
                if(i!=scr){
                    dist[i]=Integer.MAX_VALUE;
                }
            }
            boolean  vis[]=new boolean[V];
            pq.add(new Pair(0,0));
            while(!pq.isEmpty()){
                Pair curr=pq.poll();
                if(!vis[curr.node]){
                    vis[curr.node]=true;
                    for(int i=0;i<graph[curr.node].size();i++){
                        Edge e=graph[curr.node].get(i);
                        int u=e.scr;
                        int v=e.des;
                        if(dist[u]+e.wt<dist[v]){
                            dist[v]=dist[u]+e.wt;
                            pq.add(new Pair(v,dist[v]));
                        }
                    }
                }
            }
            for(int i=0;i<V;i++){
                System.out.print(dist[i]+" ");
            }
        System.out.println();
    }
    public static void bellmanford(ArrayList<Edge> graph[],int scr,int V){
    int dist[]=new int[V];
    for(int i=0;i<V;i++){
       if (i!=scr){
           dist[i]=Integer.MAX_VALUE;
        }
    }
    for (int k=0;k<V-1;k++){
        for(int j=0;j<V;j++){
            for(int i=0;i<graph[j].size();i++){
                Edge e=graph[j].get(i);
                int u=e.scr;
                int v=e.des;
                if(dist[u]!= Integer.MAX_VALUE&&dist[u]+e.wt<dist[v]){
                    dist[v]=dist[u]+e.wt;
                }
            }
        }
    }
    for(int i=0;i<dist.length;i++){
        System.out.print(dist[i]+" ");
    }
        System.out.println();
    }
public static void prims(ArrayList<Edge> graph[],int V){
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    boolean vis[]=new boolean[V];
    pq.add(new Pair(0,0));
    int mincost=0;
    while(!pq.isEmpty()){
        Pair curr=pq.remove();
        if(!vis[curr.node]){
            vis[curr.node]=true;
            mincost= curr.dist;
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
        boolean vis[] = new boolean[V];
        boolean res[] = new boolean[V];
        dijkastra(graph,0,V);
        bellmanford(graph,0,V);
        prims(graph,V);
    }

}
