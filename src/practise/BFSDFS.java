package practise;

import java.util.*;

class Graph{
    final int n;
    final  List<List<Integer>> adj ;

    public Graph(int n) {
        this.n = n;
        adj = new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
    }
    void addEdge(int u, int v, boolean undirected){
        adj.get(u).add(v);
        if(undirected)
            adj.get(v).add(u);
    }
}

class BFSResult{
    final List<Integer> order;
    final int[] dist;
    final int[] parent;

    public BFSResult(List<Integer> order, int[] dist, int[] parent) {
        this.order = order;
        this.dist = dist;
        this.parent = parent;
    }
    List<Integer> pathTo(int target){
        List<Integer> path = new ArrayList<>();
        if(dist[target]==Integer.MAX_VALUE)
            return path;
        for (int v=target;v!=-1;v = parent[v])
            path.add(v);
        Collections.reverse(path);
        return path;
    }
}

class TreeNode { int val; TreeNode left, right; TreeNode(int v){ val=v; } }

public class BFSDFS {

    public static BFSResult bfs(Graph g, int src){
        int n = g.n;
        boolean[] vis = new boolean[n];
        int[] dist = new int[n], parent = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(parent,-1);

        ArrayDeque<Integer> q = new ArrayDeque<>();
        List<Integer> order = new ArrayList<>();

        vis[src] = true; dist[src] = 0; q.add(src);
        while (!q.isEmpty()){
            int u = q.poll();
            order.add(u);
            for (int v: g.adj.get(u)){
                if(!vis[v]){
                    vis[v] = true;
                    dist[v] = dist[u]+1;
                    parent[v] = u;
                    q.add(v);
                }
            }
        }
        return new BFSResult(order, dist, parent);
    }
    // ---------- DFS (recursive) ----------
    static List<Integer> dfsRecursive(Graph g, int src){
        boolean[] vis = new boolean[g.n];
        List<Integer> order = new ArrayList<>();
        dfsRec(g, src, vis, order);
        return order;
    }
    private static void dfsRec(Graph g, int src, boolean[] vis, List<Integer> order){
        vis[src] = true;
        order.add(src);
        for( int v: g.adj.get(src)){
            if (!vis[v])
                dfsRec(g, v, vis, order);
        }
    }
    // ---------- DFS (iterative, stack) ----------
    static List<Integer> dfsIterative(Graph g, int src){
        boolean[] vis = new boolean[g.n];
        List<Integer> order = new ArrayList<>();
        ArrayDeque<Integer> st = new ArrayDeque<>();
        st.push(src);

        while (!st.isEmpty()){
            int u = st.pop();
            if (vis[u]) continue;
            vis[u]=true;
            order.add(u);
            // push neighbors in reverse if you want similar order to recursive
            List<Integer> nbrs =  g.adj.get(u);
            for (int i=nbrs.size()-1; i>=0;i--){
                int v = nbrs.get(i);
                if(!vis[v])
                    st.push(v);
            }
        }
        return order;
    }
    // ---------- Tree level-order (BFS) ----------
    static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root==null)
            return res;

        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            int sz = q.size();
            List<Integer> lvl = new ArrayList<>();
            for(int i=0;i<sz;i++){
                TreeNode node = q.poll();
                lvl.add(node.val);
                if( node.left != null) q.add(node.left);
                if( node.right != null) q.add(node.right);
            }
            res.add(lvl);
        }
        return res;
    }
    public static void main(String[] args){
        Graph g = new Graph(5);
        g.addEdge(0,1,true);
        g.addEdge(0,2,true);
        g.addEdge(1,3,true);
        g.addEdge(2,4,true);

        BFSResult bfsResult = bfs(g, 0);
        System.out.println("BFS order :"+bfsResult.order);
        System.out.println("Dist :"+bfsResult.dist[4]);
        System.out.println("Path :"+bfsResult.pathTo(4));

        System.out.println("DFS (recursive): " + dfsRecursive(g, 0)); // e.g., [0, 1, 3, 2, 4]
        System.out.println("DFS (iterative): " + dfsIterative(g, 0)); // e.g., [0, 1, 3, 2, 4]

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println("Level Order :"+ levelOrder(root));



    }
}
