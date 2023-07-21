package com.Abhinav;

import java.util.List;

public class Leetcodelinkedlistquestion {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
    /*----------------------------First where the cycle is found in the list -----------------*/
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
    /*----------------------------magic number that gives u 1 after add the sqaure of the number -----------------*/
    public boolean isaHappy(int n){
       int slow=n;
       int fast=n;
       do{
           fast=square(square(n));
                   slow=square(n);
       }
       while(slow!=fast);
       if(slow==1){
           return true;


       }
       return false;
    }
    public static int square(int number){
        int ans=0;
        while(number > 0){
            int rem=number%10;
            ans+=rem*rem;
            number=number/10;

        }
        return ans;
    }
    /*----------------------------Mid of the linkedlist -----------------*/
//    public ListNode middleNode(ListNode head){
//        ListNode fast=head;
//        ListNode slow=head;
//        while(fast!=null&&fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//        }
//        return slow;
//    }
    /*----------------------------Node class -----------------*/
    public  ListNode merge(ListNode left,ListNode rigth){
        ListNode temphead=new ListNode();
        ListNode tail=temphead;
        while(left!=null&&rigth!=null){
            if(rigth.val>left.val){
                tail.next=left;
                left=left.next;
                tail=tail.next;
            }
            else {
                tail.next=rigth;
                rigth=rigth.next;
                tail=tail.next;
            }
        }
        tail.next=(left!=null)?left:rigth;
        return temphead.next;
    }
    /*----------------------------Node class -----------------*/

    class ListNode{

        int val;
        ListNode next;
public ListNode(){

}
        public ListNode(int val) {
            this.val = val;
            next=null;

        }
    }
}
