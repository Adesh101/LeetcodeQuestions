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
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                count = findLength(slow);
                break;
            }
        }
        
        if(count == 0){
            return null;
        }
        
        ListNode first = head;
        ListNode second = head;
        
        while(count > 0){
            second = second.next;
            count--;
        }
        
        while(first != second){
            first = first.next;
            second = second.next;
        }
        
        return second;
    }
    
    public int findLength(ListNode slow){
        ListNode first = slow;
        ListNode second = slow;
        int count = 0;

        while(first != null && first.next!=null){
            first = first.next.next;
            second = second.next;

            if(first == second){
                ListNode temp = slow;
                int length = 0;

                do{
                    temp = temp.next;
                    length++;
                }
                while(temp != slow);
                return length;
            }
        }
        return 0;
    }
}