// Last updated: 9/10/2025, 2:14:29 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode turtle=head;
        ListNode rabbit=head;

        while(rabbit!=null && rabbit.next!=null){
            turtle=turtle.next;
            rabbit=rabbit.next.next;
            if(turtle==rabbit){
                return true;
            }
        }
    return false;
    }
}