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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int[] arr = new int[2];
        arr[0] = 100000;
        arr[1] = -1;
        int firstFound = -1;
        int lastFound = -1;
        int currIdx = 1;
        while(curr.next!=null){
            // System.out.println(curr.val+" "+currIdx);
            if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val)){
                //  System.out.println(curr.val+" "+currIdx+" <- ");
                if(lastFound==-1){
                    lastFound=currIdx;
                    firstFound = currIdx;
                }else{
                    if((currIdx-lastFound)<arr[0]) arr[0]=currIdx-lastFound;
                    arr[1]=currIdx-firstFound;
                    lastFound = currIdx;
                }
            }
            prev = curr;
            curr = curr.next;
            currIdx++;
        }
        if(arr[0]==100000 || arr[0]==0){
            arr[0] = -1;
            arr[1] = -1;
        }
        return arr;

    }
}