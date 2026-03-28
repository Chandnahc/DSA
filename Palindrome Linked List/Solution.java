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
    public boolean isPalindrome(ListNode head) {
        ListNode currentNode = head;
        String s= "";
        while(currentNode!=null){
            s += String.valueOf(currentNode.val);
            currentNode = currentNode.next;
        }
        return s.equals((new StringBuilder(s)).reverse().toString());
        
    }
}