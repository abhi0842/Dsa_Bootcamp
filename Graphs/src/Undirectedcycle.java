import java.util.ArrayList;

public class Undirectedcycle {
    public static boolean undirectedcycle(ArrayList<graphs_1.Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr]=true;
        for (int i=0;i<graph[curr].size();i++){
            graphs_1.Edge e=graph[curr].get(i);
            if(vis[e.des]&&par!= e.des){
                return true;
            }
            else if(!vis[e.des]){
                if(undirectedcycle(graph,vis,e.des,curr)){
                    return true;
                }
            }

        }
        return false;
    }
}
