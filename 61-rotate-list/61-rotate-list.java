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
        
        
        if(head == null || head.next == null || k == 0)
            return head;
        
        int temp = getLength(head);
        k %= temp;
        
        while(k>0){
            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;
            ListNode last = head;
            
            while(last != null && last.next != null){
                dummyHead = dummyHead.next;
                last = last.next;
            }
            
            dummyHead.next = null;
            last.next = head;
            head = last;
            k--;
        }
        return head;
    }
    
    public int getLength(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
}