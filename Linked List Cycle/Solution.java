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
        List<ListNode> l = new ArrayList<>();
        if(head==null){
            return false;
        }
        return checkNode(head,l);
    }

    private boolean checkNode(ListNode head,List l){
        int size = l.size();
        for(int i=0;i<size;i++){
            if(head.next == l.get(i)){
                return true;
            }
        }
        if(head.next!=null){
            l.add(head);
            return checkNode(head.next,l);
        }else{
            return false;
        }
    }
}