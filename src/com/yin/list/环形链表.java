package com.yin.list;

import java.util.HashSet;
import java.util.Set;

public class 环形链表 {

    //hashset 存储
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        ListNode cur = head;
        while (cur != null) {
            if (seen.add(cur)) {
                cur = cur.next;
            } else {
                return true;
            }
        }
        return false;
    }
    //快慢指针
    public boolean hasCycle1(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast ) {
            if(fast==null || fast.next==null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
