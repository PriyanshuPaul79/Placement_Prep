public class minVal {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    public static int minNode(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int leftMin= minNode(root.left);
        int rightMin = minNode(root.right);
        return Math.min(root.data,Math.min(leftMin,rightMin));
    }

    public static int productNode(Node root){
        if(root==null) return 1;
        int leftProd = productNode(root.left);
        int rightProd = productNode(root.right);
        return root.data*leftProd*rightProd;
    }
    public static int height(Node root ){
        if(root==null || root.left==null && root.right==null) return 1;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static void nthLevel(Node root, int range){
        if(root==null) return;
        if(range==1) System.out.println(root.data);
        nthLevel(root.left, range-1);
        nthLevel(root.right, range-1);
    }


    public static void main(String[] args) {
        Node root=new Node(3);
        Node a = new Node(2);
        Node b = new Node(4);
        Node c= new Node(6);
        Node d = new Node(1);
        Node e = new Node(3);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        root.left=a;
        root.right=b;
        System.out.println(minNode(root));
        System.out.println();
        System.out.println(productNode(root));
        System.out.println();
        System.out.println(height(root));
        System.out.println();
        nthLevel(root, 3);
    }
}
