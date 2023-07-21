package com.Abhinav;



public class Main {


    public static void main(String[] args) {
    LL list = new LL();


        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(12);
        list.addfirst(13);
        list.addlast(45);
        list.addindex(55,3);
//        //System.out.println(list.deletefirst());
//     list.printlist();
//        System.out.println(list.deletelast());
//        list.printlist();
//        System.out.println(list.deleteindex(2));
//        list.printlist();
//        System.out.println(list.find(12));

        LL first = new LL();
        LL second = new LL();



//        first.addlast(1);
//        first.addlast(3);
//        first.addlast(5);
//
//        second.addlast(1);
//        second.addlast(2);
//        second.addlast(9);
//        second.addlast(14);
//        LL ans = LL.merge(first, second);
//        ans.printlist();
//       LL list1 =new LL();
//       for(int i=8;i>0;i--){
//           list1.addlast(i);
//       }
//list1.printlist();
//       list1.bubbleSort();
//       list1.printlist();
        for(int i=8;i>0;i++){
            list.addlast(i);
        }
        list.printlist();
        //list.reverselistrecursion(head);
    }
}
