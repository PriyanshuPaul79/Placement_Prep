import java.util.ArrayList;

public class DepthFirstSearch {
    public static void dfs(int node, boolean vis[],ArrayList<ArrayList<Integer>> adj,Arraylist<Integer>ls){
        vis[node]=true;
        ls.add(node);
        for(Integer it: adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj,ls);
            }
        }
    }
    public ArrayList<Integer> Traversal(int v, ArrayList<ArrayList<Integer>> adj ){
        boolean vis[] = new boolean[v+1];
        vis[0]=true;
        ArrayList<Integer>ls= new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
    }
}
