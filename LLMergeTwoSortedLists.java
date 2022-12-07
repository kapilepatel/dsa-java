/*
https://leetcode.com/problems/merge-two-sorted-lists/submissions/

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Input: list1 = [], list2 = []
Output: []

Input: list1 = [], list2 = [0]
Output: [0]

 */

public class LLMergeTwoSortedLists {

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
        ListNode ln1_4 = new ListNode(9);
        ListNode ln1_3 = new ListNode(3, ln1_4);
        ListNode ln1_2 = new ListNode(2, ln1_3);
        ListNode ln1_1 = new ListNode(1, ln1_2);

        ListNode ln2_5 = new ListNode(8);
        ListNode ln2_4 = new ListNode(6, ln2_5);
        ListNode ln2_3 = new ListNode(4, ln2_4);
        ListNode ln2_2 = new ListNode(2, ln2_3);
        ListNode ln2_1 = new ListNode(1, ln2_2);

        System.out.println("input1");
        ListNode temp1 = ln1_1;
        while (temp1 != null) {
            System.out.println(temp1.val);
            temp1 = temp1.next;
        }

        System.out.println("input2");
        ListNode temp2 = ln2_1;
        while (temp2 != null) {
            System.out.println(temp2.val);
            temp2 = temp2.next;
        }

        ListNode response = mergeTwoLists(ln1_1, ln2_1);
        System.out.println("output");
        while (response != null) {
            System.out.println(response.val);
            response = response.next;
        }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedListNode = new ListNode();
        ListNode temp = mergedListNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            } else {
                temp.next = new ListNode(list2.val);
                temp = temp.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            temp.next = list1;
        }

        if (list2 != null) {
            temp.next = list2;
        }
        return mergedListNode.next;
    }


    //Try without using new linkedList
    //using in-place
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode tempPrev;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp = list1;
                tempPrev = list1;
                list1 = list1.next;
            } else {
                temp = list2;
                tempPrev = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            temp.next = list1;
        }

        if (list2 != null) {
            temp.next = list2;
        }
        return temp.next;
    }
}