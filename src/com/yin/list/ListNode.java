package com.yin.list;


import java.util.ArrayList;
import java.util.List;

public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

     public ListNode reverseList(ListNode head) {
          List arrayList = new ArrayList();
          ListNode pre = head;
          while (pre != null) {
               arrayList.add(pre.val);
               pre = pre.next;
          }
          int size = arrayList.size() - 1;
          pre = head ;
          while (size >= 0) {
               pre.val = (int)arrayList.get(size);
               pre = pre.next;
               size--;
          }
          return head;
     }

     public ListNode reverseList1(ListNode head) {
          ListNode pre = null;
          ListNode cur = head;
          while (cur != null) {
               ListNode temp = cur.next;
               cur.next = pre;
               pre = cur;
               cur = temp;
          }
          return pre;
     }

}