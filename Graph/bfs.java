import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>(); //for the output sequence 
        boolean visited[] = new boolean[V]; //to check whether the node is visted or not
        Queue<Integer> q = new LinkedList<>();
        q.add(0);  // initially add the root
        visited[0]=true; // mark it visited
        
        while(!q.isEmpty()){
            Integer node = q.poll(); //use Integer in place of int as here we are accessing an integer object from adjacency list 
            bfs.add(node); // add that node into the output sequesnce
            for(Integer it : adj.get(node)){
                if(visited[it]==false){   // while checking neighbour  
                    visited[it]=true; //if neighbour is not visited then mark it visited
                    q.add(it); // add that element into queue
                }
            }
        }
        return bfs;
    }
}
