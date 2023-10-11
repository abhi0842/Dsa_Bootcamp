import java.util.Arrays;

public class BST {
    public class Node{
       private int data;
        private Node left;
        private int height;
        private Node Right;

        public Node(int data){
            this.data=data;
        }
        public int getData(){
            return data;
        }
    }
    private Node root;
    public BST(){

    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isempty(){
        return root==null;
    }
    public void insert(int data){
        root=insert(data,root);
    }
    public Node insert(int data,Node node){
        if(node==null){
            node=new Node(data);
            return node;
        }
        if(data<node.data){
             node.left=insert(data,node.left);
        }
        if(data> node.data){
            node.Right=insert(data,node.Right);
        }
        node.height=Math.max(height(node.left),height(node.Right))+1;
        return node;
    }
    public  boolean balance(){
     return balance(root);
    }
    private boolean balance(Node node){
        if(node==null){
            return true;
        }
        return  Math.abs(height(node.left)-height(node.Right))<=1 && balance(node.left)&&balance(node.Right);
    }
    public void populate(int nums[]){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public void populatesorted(int[]nums){
        populatesorted(nums,0,nums.length);
    }
    public void populatesorted(int []nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid =start+(end-start)/2;
        this.insert(nums[mid]);
        populatesorted(nums, start, mid);
        populatesorted(nums, mid+1, end);

    }
    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.data);
        display(node.left,"left child of"+node.data+" :");
        display(node.Right, "right child of"+node.data+" :");
    }
    public  Node buildtree(int preorder[],int inorder[]){
        if(preorder.length==0){
            return null;
        }
        int r=preorder[0];
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==r){
                index=i;
            }
        }
        Node root=new Node(r);
        Node left=buildtree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        Node right=buildtree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));
        return root;
    }
}
