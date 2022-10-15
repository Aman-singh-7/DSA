package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijistraAlgo {

    static  class Node {
        int v;
        int wt;
        Node(int vertex,int weight)
        {
            v=vertex;
            wt=weight;
        }
    }
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int dis[] =new int[V];
        for(int i=0;i<V;i++)
        {
            dis[i]=Integer.MAX_VALUE;
            
        }
        PriorityQueue<Node> pq=new PriorityQueue<>((Node a,Node b)->{return a.wt-b.wt;});
        dis[S]=0;
        
        pq.add(new Node(S,0));
        while(!pq.isEmpty())
        {
            Node node=pq.remove();
            
            for(int i=0;i<adj.get(node.v).size();i++)
            {
                int x=adj.get(node.v).get(i).get(0);
                int w=adj.get(node.v).get(i).get(1);
                if(dis[node.v]+w<dis[x])
                {
                    dis[x]=node.wt+w;
                    pq.add(new Node(x,dis[x]));
                }
                
            }
            
        }
        
        return dis;
    }
    
}
