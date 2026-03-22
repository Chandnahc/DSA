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
    public ListNode removeElements(ListNode head, int val) {
        ListNode currentNode = head;
        ListNode lastNode = head;
        ListNode validHead = null;
        while(currentNode != null){
            if(validHead==null && currentNode.val!=val){
                validHead = currentNode;
            }
            if(currentNode == lastNode){
                if(currentNode.val == val){
                    lastNode = lastNode.next;
                    currentNode = currentNode.next;
                }else{
                    currentNode = currentNode.next;
                }
            }else{
                if(currentNode.val == val){
                    lastNode.next = null;
                    currentNode = currentNode.next;
                }else{
                    lastNode.next = currentNode;
                    lastNode = lastNode.next;
                    currentNode = currentNode.next;
                }
            }
        }
        return validHead;
    }
}