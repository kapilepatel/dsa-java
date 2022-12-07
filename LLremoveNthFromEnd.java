/*
https://leetcode.com/problems/remove-nth-node-from-end-of-list/

19. Remove Nth Node From End of List

 Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Input: head = [1,2], n = 1
Output: [1]


*/

/*
 * Definition for singly-linked list.
 */

public class LLremoveNthFromEnd {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public void fun1() {
        int n = 3;
        ListNode ln1_5 = new ListNode(5);
        ListNode ln1_4 = new ListNode(4, ln1_5);
        ListNode ln1_3 = new ListNode(3, ln1_4);
        ListNode ln1_2 = new ListNode(2, ln1_3);
        ListNode ln1_1 = new ListNode(1, ln1_2);

        System.out.println("input1");
        ListNode temp1 = ln1_1;
        while (temp1 != null) {
            System.out.println(temp1.val);
            temp1 = temp1.next;
        }

        ListNode response = removeNthFromEnd(ln1_1, n);
        System.out.println("output");
        while (response != null) {
            System.out.println(response.val);
            response = response.next;
        }
    }

    //using Fast and Slow pointer
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;

        //Set fast pointer as per n
        for(int i = 0; i < n; i++)
        {
            fast = fast.next;
        }
        //System.out.println("fast "+fast.val);
        //System.out.println("slow "+slow.val);
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        //toBeDeleted = slow.next;
        //delete toBeDeleted
        slow.next = slow.next.next;

        return start.next;
    }
}

//    public ListNode removeNthFromEnd(ListNode node, int n){
//
//        recursiveCheck(node, n);
//        return null;
//    }


//    public int recursiveCheck(ListNode node,int n){
//
//        System.out.println("entering with node value " + node.val +" and n = "+n);
//
//        if(node.next != null){
//            n = recursiveCheck(node.next, n);
//            //System.out.println("inside node value " + node.val +" and n = "+n);
//        }
//        n--;
//
//        if(n == 0){
//            System.out.println("inside node value " + node.val +" and n = "+n);
//
//
//        }
//        return n;
//}







