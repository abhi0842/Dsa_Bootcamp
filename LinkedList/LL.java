public class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //add first
    public  void addfirst(String data){
        Node newNode =new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head =newNode;
    }
    //add at last
    public void addlast(String data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode =currNode.next;

        }
        currNode.next=newNode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("lait is empty");
            return ;
        }
       Node currNode =head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode =currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list =new LL();
        list.addfirst("I");
        list.addfirst("am");
      list.printlist();
      list.addlast("good");
      list.printlist();
    }
}
