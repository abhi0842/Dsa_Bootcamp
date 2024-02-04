import java.util.ArrayList;
import java.util.Stack;
//this algo is used to find the scc(strongly connected components )of the graph which mean this algo is used to find the all possible components  which are strongly connected to the each other in the graph

public class Kosaraju {
    public static class Edge{
        int scr;
        int des;
        int wt;
        public Edge(int scr,int des,int wt){
            this.scr=scr;
            this.des=des;
            this.wt=wt;
        }
        public Edge(int scr,int des){
            this.scr=scr;
            this.des=des;
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));


        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));



    }
    public static  void topsort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer> stack){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.des]){
               topsort(graph,e.des,vis,stack);
            }
        }
        stack.push(curr);
    }
    public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
       for(int i=0;i<graph[curr].size();i++){
           Edge e=graph[curr].get(i);
           if(!vis[e.des]){
               dfs(graph,e.des,vis);
           }
       }
    }
    public static void kosaraju(ArrayList<Edge> graph[],int v){
        //Step 1
        Stack<Integer> stack=new Stack<>();
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                topsort(graph,i,vis,stack);

            }
        }
        ArrayList<Edge>transpose[]=new ArrayList[v];
        for(int i=0;i<graph.length;i++){
           vis[i]=false;
            transpose[i]=new ArrayList<Edge>();
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<graph[i].size();j++) {
                Edge e = graph[i].get(j);
                transpose[e.des].add(new Edge(e.des, e.scr));
            }
        }
        while(!stack.isEmpty()){
            int curr=stack.pop();
            if(!vis[curr]){
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        int v=6;

        ArrayList<Edge> graph[] = new ArrayList[v];
        create(graph);
        kosaraju(graph,v);
    }
}