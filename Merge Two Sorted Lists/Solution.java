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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode currentNode = null;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                if(head == null){
                    currentNode = list1;
                    head = currentNode;
                    list1 = list1.next;
                }else{
                    currentNode.next = list1;
                    list1 = list1.next;
                    currentNode = currentNode.next;
                }
            }else{
                if(head == null){
                    currentNode = list2;
                    head = currentNode;
                    list2 = list2.next;
                }else{
                    currentNode.next = list2;
                    list2 = list2.next;
                    currentNode = currentNode.next;
                }
            }
        }
        if(list1 == null){
            if(currentNode == null){
                return list2;
            }else{
                currentNode.next = list2;
            }
        }
        if(list2 == null){
            if(currentNode == null){
                return list1;
            }else{
                currentNode.next = list1;
            }
        }
        return head;
    }
}