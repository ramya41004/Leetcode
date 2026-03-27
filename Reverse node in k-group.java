class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while (count < k && curr != null) {
            curr = curr.next;
            count++;
        }
        if (count == k) {
            ListNode reversedHead = reverse(head, k);
            
      
            head.next = reverseKGroup(curr, k);
            return reversedHead;
        }   
        return head;
    }
    private ListNode reverse(ListNode head, int n) {
        ListNode prev = null;
        ListNode curr = head;
        while (n > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            n--;
        }
        return prev;
    }
}
