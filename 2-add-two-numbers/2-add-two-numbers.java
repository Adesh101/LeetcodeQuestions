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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode s1 = l1;
        ListNode s2 = l2;
        ListNode s3 = new ListNode(0);
        ListNode temp = s3;
        int sum = 0, carry = 0;
        
        while(s1 != null || s2 != null){
            if(s1 == null){
                sum = s2.val + carry;
            }
            else if(s2 == null){
                sum = s1.val + carry;
            }
            else{
                sum = s1.val + s2.val + carry;    
            }
            carry = sum/10;
            ListNode dummyNode = new ListNode(sum%10);
            temp.next = dummyNode;
            temp = temp.next;
            if(s1 != null)
                s1 = s1.next;    
            if(s2 != null)
                s2 = s2.next;
        }
        if(carry==1){
            ListNode tempNode = new ListNode(1);
            temp.next = tempNode;
        }
            
        return s3.next;
    }
}