import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner=new Scanner(System.in);
//        Binary_Tree tree =new Binary_Tree();
//
//        tree.populate(scanner);
//        tree.arrowdisplay();
        BST tree=new BST();
//        tree.populate(new int[]{5,7,3,4,2,6,});
//        tree.display();
        int preoder[]={3,9,20,15,7};
        int inorder[]={9,3,15,20,7};
        tree.buildtree(preoder,inorder);
        tree.display();
    }
}