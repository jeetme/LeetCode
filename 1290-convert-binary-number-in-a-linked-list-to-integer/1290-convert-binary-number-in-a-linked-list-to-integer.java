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
    public int getDecimalValue(ListNode head) {
        String binary = "";
        ListNode curr = head;
        while(curr != null) {
            binary = binary + Integer.toString(curr.val);
            curr = curr.next;
        }
        int decimal = Integer.parseInt(binary, 2);
        return decimal;
    }
}