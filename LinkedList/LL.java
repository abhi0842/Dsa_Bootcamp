package com.Abhinav;

public class LL {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LL() {
      this.size = 0;

    }
    private class ListNode {
        private int val;
        private ListNode next;
        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public  void addfirst(int val){
       ListNode newnode = new ListNode(val);
       newnode.next=head;
       head=newnode;
       if(tail==null){
           tail=head;
       }
       size++;
    }
    public void printlist(){
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val  + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void addlast(int val){
        if(tail==null){
            addfirst(val);
            return ;
        }
        ListNode newnode =new ListNode(val);
        tail.next=newnode;
        tail=newnode;
        size++;

    }
    public void addindex(int val,int index){
        if(index==0){
            addfirst(val);
            return;
        }
        if(index==size){
            addlast(val);
        }
        ListNode temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        ListNode newnode=new ListNode(val,temp.next);
        temp.next=newnode;
        size++;

    }
    public int deletefirst(){
        int val= head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        return val;
    }
    public ListNode getindex(int index){
        ListNode temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

public int  deletelast(){
        if(size<=1){
            return deletefirst();
        }
    ListNode secondlast= getindex(size-2);
        int val= tail.val;
        tail=secondlast;
        tail.next=null;
        return val;
}
public int  deleteindex(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
    ListNode pre=getindex(index-1);
        int val =pre.next.val;
        pre.next=pre.next.next;
    size--;
        return val;

}
public ListNode find(int value){
    ListNode node = head;
        while(node!=null){
            if(node.val==value){
                return node;
            }
            node = node.next;
        }
        return null;
}
    public static LL merge(LL first, LL second) {
        ListNode f = first.head;
        ListNode s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.addlast(f.val);
                f = f.next;
            } else {
                ans.addlast(s.val);
                s = s.next;
            }
        }

        while (f != null) {
            ans.addlast(f.val);
            f = f.next;
        }

        while (s != null) {
            ans.addlast(s.val);
            s = s.next;
        }

        return ans;
    }
    public  boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    /*----------------------------Return length of cycle in the list which consist of cycle-----------------*/
public static int cyclelength(ListNode head){
    ListNode fast=head;
    ListNode slow=head;
    while(fast!=null&&fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow){
            ListNode temp=slow;
           int length=0;
           do{
               temp=temp.next;
               length++;
           }
           while(temp!=slow);
           return length;
        }
    }
    return 0;
}
    /*----------------------------Bubblesort in the linkedlist-----------------*/
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            ListNode first = getindex(col);
            ListNode second = getindex(col + 1);

            if (first.val > second.val) {
                // swap
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    ListNode prev = getindex(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    ListNode prev = getindex(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }
    public void reverselistrecursion(ListNode node){
        if(node==tail){
            head=tail;
            return;

        }
        reverselistrecursion(node.next);
        tail.next=node;
        tail=node;
        tail.next =null;
    }
    public ListNode revrse(ListNode noode){
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=Next;
            if(Next!=null){
                Next=Next.next;
            }

        }
       return  prev  ;
    }
    public ListNode reversell2(ListNode head ,int left,int right){
       if(left==right){
           return head;
       }
       //this part is used to skip the node before the left
       ListNode prev= null;
        ListNode curr=head;
        for(int i=0;curr!=null&&i<left-1;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode last=prev;
        ListNode endnode=curr;
        ListNode Next=head.next;
        for(int i=0;curr!=null&&i<right-left+1;i++){
            curr.next=prev;
            prev=curr;
            curr=Next;
            if(Next!=null){
                Next=Next.next;
            }

        }
        if(last!=null){
            last.next=prev;
        }
        else{
            head=prev;
        }
        endnode.next=curr;
        return head;
    }
    public ListNode deleteformend(ListNode head, int n){

    }
}