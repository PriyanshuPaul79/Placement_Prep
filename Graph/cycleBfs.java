import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cycleBfs {


// make a custom datatype pair 
class pair{
    int first;
    int second;
    public pair(int first,int second ){
        this.first=first;
        this.second=second;
    }
}
    public boolean checkCycle(int src, int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        // 1. mark visited of the start node to true 
        vis[src]=true;

        // 2. create a queue inside which make a pair of child node and its parent 
        Queue<pair>q= new LinkedList<>();
        q.add(new pair(src,-1));

        while(!q.isEmpty()){
        // 3. extract the parent and the child then remove that pair from the queue
        int child = q.peek().first;
        int parent = q.peek().second;
        q.remove();

        // 4. search in the adj list of the child if any unvisited node is present or not  
        for(int target : adj.get(child)){
            if(vis[target]==false) {
            vis[target] = true;
            q.add(new pair(target,child));
        } 
        // 5. if the node is not parent then there is a cycle 
        else if(parent!=target){
            if(vis[target]==true) return true;
        } 
    }
    }
     return false;   
    }



    public boolean isCycle(int v, ArrayList<ArrayList<Integer>>adj){
        boolean vis[] = new boolean[v];
        for(int i=0;i<v;i++) vis[i] = false;
        for(int i=0;i<v;i++) {
            if(vis[i]==false){
                if(checkCycle(i,v,adj,vis)) return true;
            }
        }
        return false;
    }
}
