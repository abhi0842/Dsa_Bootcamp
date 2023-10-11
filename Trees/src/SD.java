import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SD {
    public class Node{
        private int val;
        private Node left;
        private int height;
        private Node Right;

        public Node(int data){
            this.val=data;
        }
        public int getData(){
            return val;
        }
    }
    public List<String> serialize(Node node){
        List<String> list=new ArrayList<>();
        helperfun(node,list);
        return list;
    }
    public static List<String> helperfun(Node node,List<String> list){
        if(node==null) {
            list.add("null");
            return list;

        }
        list.add(String.valueOf(node.val));
        helperfun(node.left,list);
        helperfun(node.Right,list);
        return list;
    }
    public Node deserislize(List<String> list){
        Collections.reverse(list);
        Node node=helperfun2(list);
        return node;
    }
    public  Node helperfun2(List<String> list){
        String val =list.remove(list.size()-1);
        if(val.charAt(0)=='n'){
            return null;
        }
        Node node =new Node(Integer.parseInt(val));
        node.left=helperfun2(list);
        node.Right=helperfun2(list);
        return node;
    }
}
