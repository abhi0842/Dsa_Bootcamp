import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class graphs_1 {
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
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));





    }
public static void bfs(ArrayList<Edge> graph[],int v,int start,boolean vis[] ){
    Queue<Integer> queue=new LinkedList<>();

    queue.add(start);
    while(!queue.isEmpty()){
        int curr =queue.remove();
        if(vis[curr]==false){
            System.out.print(curr+" ");
            vis[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                queue.add(e.des);
            }
        }
    }
}
public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        //In dfs we first print the current element of the graph and then we make the current  element true
    //then we find the neibours o
    System.out.print(curr+" ");
    vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){

        Edge e=graph[curr].get(i);
        if(vis[e.des]==false){
            dfs(graph,e.des,vis );
        }

    }
}
public static void  allpath(ArrayList<Edge> graph[],int curr,int tar,String path,boolean vis[]){
        if(curr==tar){
            System.out.println(path);
            return;
        }
        //In this methord their is a slite change in the dfs method which is when we call the recurssive call first we check the visited array that if the current element is false make it true and when we backtrack we must have to make  the visited array false
    // This is because we want to find the all path in the graph and in the process we must have to visit the same node multiple time.
    for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.des]==false){
            vis[curr]=true;
                allpath(graph,e.des,tar,path+e.des,vis);
                vis[curr]=false;
            }


        }
}
public static boolean cycle(ArrayList<Edge> graph[],boolean res[],boolean vis[],int curr){
        vis[curr]=true;
        res[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(res[e.des]==true){
                return true;
            }
            else if(!vis[e.des]){
                if(cycle(graph,res,vis, e.des)){
                    return true;
                }
            }
        }
        res[curr]=false;
        return false;
}
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        create(graph );
 boolean vis[]=new boolean[v];
        boolean res[]=new boolean[v];
//        for(int i=0;i<v;i++){
//            if(vis[i]==false){
//                bfs(graph,v,i,vis);
//            }
//        }
//
//        System.out.println();

        //allpath(graph,1,5,"",vis);
        System.out.println(cycle(graph,res,vis,0));

}
    }


