import java.util.ArrayList;
import java.util.Arrays;

public class BST_Questions {
    static  public class Node{
        int data;
        Node right;
        Node left;

          Node(int data) {
            this.data=data;
        }
    }
    public static Node insert(Node root, int val){
          if(root==null){
              root=new Node(val);
              return root;
          }
          if(root.data>val){
             root.left=insert(root.left,val);
          }
         else{
              root.right=insert(root.right,val);
          }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left,key);

        }
        else if(root.data==key){
            return true;
        }
        else{
            return search(root.right,key);
         }
    }

public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }

        else{//root.data==val that wants to delete
         if(root.left==null&&root.right==null){
             return null;
         }
         if(root.left==null){
             return root.right;
         }
         else if (root.right==null){
             return root.left;
         }

         else{
         Node IS=inordersuccessor(root);
         root.data=IS.data;
         delete(root.right, IS.data);
         }
        }
    return root;
}
public static Node inordersuccessor(Node root){
     while (root!=null){
         root=root.left;

     }
     return root;
}
public static void printinrange(Node root,int x,int y){
        if(root==null){
            return ;
        }
        if(root.data>=x&&root.data<=y){
            printinrange(root.left,x,y);
            System.out.print(root.data+" ");
            printinrange(root.right,x,y);
        }
        else if(root.data<=y){
            printinrange(root.right,x,y);
        }
        else{
            printinrange(root.left,x,y);
        }
}
    public static void printpath(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }

        list.add(root.data );
        if(root.left==null&&root.right==null){
            print(list);
        }
        else{
            printpath(root.left,list);
            printpath(root.right,list);

        }
        list.remove(list.size()-1);
    }
    public static void print(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int value[]={8,5,3,6,10,14};
        Node root=null;
        for(int i=0;i<value.length;i++){
            root=insert(root,value[i]);
        }
        inorder(root);
        System.out.println();
//        System.out.println(delete(root,3));
//        inorder(root);
//        System.out.println();
//        printinrange(root,2,5);
        printpath(root,new ArrayList<>());
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
        Node node=new Node(r);
        node.left=buildtree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder, 0,index));
        node.right=buildtree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder, index+1,inorder.length));
        return node;
    }


}
