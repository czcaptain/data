package com.yin.list;



public class 合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headNode = new ListNode(0);
        ListNode pre = headNode;
        if(list1 == null && list2 ==null) {
            return null;
        }
        if(list1==null) {
            pre.next= list2.next;
        }
        if(list2==null) {
            pre.next= list1.next;
        }
        while (list1 != null && list2 != null) {
                if(list1.val >= list2.val) {
                    pre.next = list2;
                    list2 = list2.next;
                    //pre = pre.next;
                } else {
                    pre.next = list1;
                    list1 = list1.next;
                    //pre = pre.next;
                }
            pre = pre.next;
        }

        if(list1 != null) {
            pre.next = list1;
        } else if(list2 != null) {
            pre.next = list2;
        }
        return headNode.next;
    }
}

/**
 *
 *
 *
 *
 */