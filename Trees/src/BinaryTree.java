public class BinaryTree {
   static  class Node{
        int data ;
        Node left;
        Node right;
        Node(int data){
           this.data=data;
           this.left=null;
           this.right=null;
        }
    }
    static class binarytree{
       static int index=-1;
       static Node buildtree(int arr[]){
         index++;
         if(arr[index]==-1){
              return null ;
         }
         Node currnode =new Node(arr[index]);
         currnode.left=buildtree(arr);
         currnode.right=buildtree(arr);
         return currnode;
       }

    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }

        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }

        preorder(root.left);
        System.out.print(root.data);
        preorder(root.right);

    }
    public static int height(Node root){
       if(root==null){
           return 0;
       }
       int leftheight=height(root.left);
       int rightheight=height(root.right);
       int height=Math.max(leftheight,rightheight)+1;
      return height;
    }
    public static  int sumofnode(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumofnode(root.left);
        int rightsum=sumofnode(root.right);

        return  leftsum + rightsum + root.data;
    }


    public static void main(String[] args) {
       int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.buildtree(arr);
        //System.out.println(root.data);
        //postorder(root);
        System.out.println(sumofnode(root));
    }
}
