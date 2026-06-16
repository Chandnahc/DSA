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
    public int pairSum(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode current = head;
        while(current!=null){
            l.add(current.val);
            current = current.next;
        }
        int maxSum = -1;

        for(int i=0;i<l.size()/2;i++){
            int currentSum = l.get(i)+l.get(l.size()-1-i);
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}