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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] spiral = new int[m][n];
        int len = m * n;
        for(int v = 0; v < m; v++) {
            for(int h = 0; h < n; h++) {
                spiral[v][h] = -1;
            }
        }
        ListNode curr = head;
        int h = 0, v = 0, hStep = 1, vStep = 0;
        while(curr != null) {
            spiral[v][h] = curr.val;
            curr = curr.next;
            if(!(0 <= h + hStep && h + hStep < n
                    && 0 <= v + vStep && v + vStep < m)
                    || spiral[v + vStep][h + hStep] != -1) {
                int temp = hStep;
                hStep = -vStep;
                vStep = temp;
            }
            v = v + vStep;
            h = h + hStep;
        }
        return spiral;
    }
}