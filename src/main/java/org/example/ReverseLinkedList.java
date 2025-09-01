package org.example;
import java.util.*;


public class ReverseLinkedList {
public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}



    //Solution :
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
