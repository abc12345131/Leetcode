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
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode preHead = new ListNode();
        ListNode runner = head;
        
        while(runner != null) {
            ListNode tmp = preHead.next;
            preHead.next = runner;
            runner = runner.next;
            preHead.next.next = tmp;
        }
        return preHead.next;
    }
}；