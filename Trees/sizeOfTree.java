import java.util.LinkedList;
import java.util.Queue;

public class sizeOfTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int val) {
            data = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        } else
            return;
    }

    public static void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        } else
            return;
    }

    public static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        } else
            return;
    }

    public static int maxDepth(Node root){
        if(root==null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        int level=0;

        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node f= q.poll();
                if(f.left!=null) q.add(f.left);
                if(f.right!=null) q.add(f.right);
            }
            level++;
        }
        return level;
    }

    public static void main(String args[]) {
        Node a = new Node(4);
        Node b = new Node(7);
        Node c = new Node(14);
        Node d = new Node(24);
        Node e = new Node(34);
        Node f = new Node(44);
        Node g = new Node(54);
        a.left = b;
        b.right = c;
        c.left = d;
        a.right = g;
        c.right = e;
        e.left = f;
        preOrder(a);
        postOrder(a);
        preOrder(a);

    }
}
