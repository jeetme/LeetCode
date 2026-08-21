/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();

        ListNode curr = headA;
        while(curr != null) {
            visited.add(curr);
            curr = curr.next;
        }

        curr = headB;
        while(curr != null) {
            if(visited.contains(curr)) { 
                return curr;
            }
            curr = curr.next;
        }
        return null;
    }
}