//You are given two non-empty linked lists representing two non-negative integers.
// The digits are stored in reverse order, and each of their nodes contains a single digit.
// Add the two numbers and return the sum as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
//
//
//
//Example 2:
//
//Input: l1 = [0], l2 = [0]
//Output: [0]
//
//
//Example 3:
//
//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//Output: [8,9,9,9,0,0,0,1]

import java.util.List;

import static java.util.Objects.nonNull;
public class LLAddTwoNumbers {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */


    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
   public void fun1(){
       ListNode ln1_3 = new ListNode();
       ln1_3.val = 3;

       ListNode ln1_2 = new ListNode();
       ln1_2.val = 4;
       ln1_2.next = ln1_3;

       ListNode l1 = new ListNode();
       l1.val = 2;
       l1.next = ln1_2;


       ListNode ln2_3 = new ListNode();
       ln2_3.val = 4;

       ListNode ln2_2 = new ListNode();
       ln2_2.val = 6;
       ln2_2.next = ln2_3;

       ListNode l2 = new ListNode();
       l2.val = 5;
       l2.next = ln2_2;

       ListNode response  = addTwoNumbers(l1, l2);

       //        ListNode temp1 = l1;
//        while (temp1 != null)
//        {
//            System.out.println(temp1.val);
//            temp1 = temp1.next;
//        }
//
//        ListNode temp2 = l2;
//        while (temp2 != null)
//        {
//            System.out.println(temp2.val);
//            temp2 = temp2.next;
//        }

        while (response != null)
        {
            System.out.println(response.val);
            response = response.next;
        }
   }

    public void fun2(){

        ListNode ln1_7 = new ListNode(9);
        ListNode ln1_6 = new ListNode(9,ln1_7 );
        ListNode ln1_5 = new ListNode(9,ln1_6);
        ListNode ln1_4 = new ListNode(9,ln1_5);
        ListNode ln1_3 = new ListNode(9,ln1_4);
        ListNode ln1_2 = new ListNode(9,ln1_3);
        ListNode ln1_1 = new ListNode(9,ln1_2);


        ListNode ln2_4 = new ListNode(9);
        ListNode ln2_3 = new ListNode(9,ln2_4);
        ListNode ln2_2 = new ListNode(9,ln2_3);
        ListNode ln2_1 = new ListNode(9,ln2_2);

        System.out.println("input1");
        ListNode temp1 = ln1_1;
        while (temp1 != null)
        {
            System.out.println(temp1.val);
            temp1 = temp1.next;
        }
        System.out.println("input1");
        ListNode temp2 = ln2_1;
        while (temp2 != null)
        {
            System.out.println(temp2.val);
            temp2 = temp2.next;
        }

        ListNode response  = addTwoNumbers(ln1_1, ln2_1);

        while (response != null)
        {
            System.out.println(response.val);
            response = response.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode nodeFinal = new ListNode();
        ListNode cur = nodeFinal;

        while (l1 != null || l2 != null || carry > 0 )
        {
            int sum = 0;
            if(l1 != null)
            {
                sum += l1.val;
            }
            if(l2 != null)
            {
               
                sum += l2.val;
            }
            sum += carry;

            cur.next = new ListNode(sum % 10);
            carry = sum / 10; //will be reset

            if(l1 != null)
            {
                l1 = l1.next;
            }
            if(l2 != null)
            {
                l2 = l2.next;
            }
            System.out.println("adding: "+sum % 10);
            cur = cur.next;
        }
        return nodeFinal.next;
    }
}

