package com.cherednik;

class ListNode {
    private int value ;
    ListNode next;

    ListNode(int x) {
        value = x;
    }

    ListNode deleteDuplicates(ListNode head) throws Exception {
        if (head == null){
            throw new Exception("Object can't be null");
        }
        ListNode node =  head;
        while (node.next != null) {
            if (node.getValue() == node.next.getValue()) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    private int getValue() {
        return value ;
    }

    @Override
    public String toString() {
        if (next != null) {
            return value + "->" + next;
        } else {
            return value + "";
        }
    }
}
