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
        int carry = 0;
        
        while(s1 != null || s2 != null || carry == 1){
            int sum=0;
            if(s1!=null){
                sum += s1.val;
                s1 = s1.next;
            }
            if(s2!=null){
                sum += s2.val;
                s2 = s2.next;
            }
            ListNode dummyNode = new ListNode((sum+carry)%10);
            temp.next = dummyNode;
            temp = temp.next;
            carry = (sum+carry)/10;
        }
            
        return s3.next;
    }
}