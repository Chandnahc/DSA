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
    public ListNode rotateRight(ListNode head, int k) {
        int totalNodes = 0;
        if(head == null){
            return head;
        }
        ListNode currentNode = head;
        while(currentNode!=null){
            currentNode = currentNode.next;
            totalNodes++;
        }
        int updatePosition = totalNodes - k%totalNodes;
        currentNode = head;
        ListNode tempNode = null;
        while(currentNode.next!=null){
            if(--updatePosition == 0){
                tempNode = currentNode;
            }
            currentNode = currentNode.next;
        }
        if(tempNode!=null){
            currentNode.next = head;
            head = tempNode.next;
            tempNode.next = null;
        }
        return head;

    }
}