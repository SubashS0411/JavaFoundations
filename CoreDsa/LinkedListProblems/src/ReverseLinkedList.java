///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//leetcode 208:Reverse Linked List
//https://leetcode.com/problems/reverse-linked-list/description/
//class Solution {
//    public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null) return head ;
//        ListNode prev=null;
//        ListNode current=head;
//        while(current!=null){
//            ListNode next=current.next;
//            current.next=prev;
//            prev=current;
//            current=next;
//        }
//        return prev;
//    }
//}
class ReverseLinkedList{
    public static void main(String[] args) {

    }
}