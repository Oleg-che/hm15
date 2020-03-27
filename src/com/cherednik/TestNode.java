package com.cherednik;

public class TestNode {

    public static void main(String[] args) throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        System.out.println(head);
        head.deleteDuplicates(head);
        System.out.println(head);
    }


}
