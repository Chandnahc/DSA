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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        ListNode lastNode = new ListNode(Integer.MIN_VALUE);
        while(currentNode!=null){
            if(currentNode.val>lastNode.val){
                lastNode.next = currentNode;
                lastNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        lastNode.next = null;
        return head;
    }
}