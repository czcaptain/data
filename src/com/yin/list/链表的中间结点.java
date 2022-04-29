package com.yin.list;




public class 链表的中间结点 {
    public ListNode middleNode(ListNode head) {
        ListNode ans = head;
        int sz = 0;
        while (head != null) {
           head = head.next;
           sz++;
        }
        double ceil = Math.ceil(sz / 2);
        for (int i = 0; i < ceil; i++) {
            ans = ans.next;
        }
        return ans;
    }
}
