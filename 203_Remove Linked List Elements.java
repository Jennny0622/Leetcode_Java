class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode result = removeElements(head.next, val);
        if(head.val!=val){
            head.next=result;
            return head;
        }
        return result;
    }
}
