public class Traversal{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        } else return;
    }

    public static void main(String[] args) {
        Node k = new Node(5);
        Node a = new Node(7);
        Node b = new Node(12);
        k.left=a;
        k.right=b;
        preOrder(k);
    }
}