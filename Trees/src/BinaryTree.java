import java.sql.ClientInfoStatus;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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

    public  int pathsum(Node root){
       return helper(root);
    }
    int ans=Integer.MIN_VALUE;
    public  int helper(Node root){
        if(root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        left=Math.max(0,left);
        right=Math.max(0,right);
        int pathsum=left+right+root.data;
        ans=Math.max(ans,pathsum);
        return Math.max(left,right)+ root.data;
    }
    public boolean findPath(Node root,int arr[]){
        if(root==null){
            return arr.length==0;
        }
        return helper(root,arr,0);
    }
    public boolean helper(Node root,int arr[],int index){
        if(root==null){
            return false;
        }
        if(index>=arr.length||root.data!=arr[index]){
            return false;
        }
        if(root.left==null&&root.right==null&&index==arr.length-1){
            return true;
        }
        return helper(root.left,arr,index+1)||helper(root.right,arr,index+1);
    }
    public int countsum(Node root,int sum){
        List<Integer> list=new LinkedList<>();
        return helper(root,sum,list);



    }
    /* Time complexity of this program  is n^2 in worst case and in case of balance tree the time  complexity of this program is nlog(n) */
    public int helper(Node root,int sum,List<Integer> list){
        if(root==null){
            return 0;
        }
        list.add(root.data);
        int count =0;
        int s=0;
        ListIterator<Integer> iter=list.listIterator(list.size());
        while(iter.hasPrevious()){
            s+= iter.previous();
            if(s==sum){
                 count++;

            }
        }
        count+=helper(root.left,sum,list)+helper(root.right,sum,list);
        list.remove(list.size()-1);
        return count;

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
