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
        int carry = 0;
        ListNode output = new ListNode();
        ListNode head = output;
        while (true) {
            if (l1 == null && l2 == null) {
                if (carry == 1) {
                    output.val = 1;
                    output.next = null;
                }
                break;
            } else if (l1 == null) {
                if (l2.val + carry == 10) {
                    output.val = 0;
                    l2 = l2.next;
                    output.next = new ListNode();
                    output = output.next;
                    carry = 1;
                    continue;
                }
                output.val = l2.val + carry;
                carry = 0;
                l2 = l2.next;
                if (l2 != null) {
                    output.next = new ListNode();
                    output = output.next;
                }
            } else if (l2 == null) {
                if (l1.val + carry == 10) {
                    output.val = 0;
                    l1 = l1.next;
                    output.next = new ListNode();
                    output = output.next;
                    carry = 1;
                    continue;
                }
                output.val = l1.val + carry;
                carry = 0;
                l1 = l1.next;
                if (l1 != null) {
                    output.next = new ListNode();
                    output = output.next;
                }
            } else {
                int sum = l1.val + l2.val;
                if (sum + carry == 10) {
                    output.val = 0;
                    output.next = new ListNode();
                    output = output.next;
                    carry = 1;
                    l1 = l1.next;
                    l2 = l2.next;
                    continue;
                }
                output.val = sum % 10 + carry;
                carry = 0;
                l1 = l1.next;
                l2 = l2.next;
                if (sum >= 10) {
                    carry = 1;
                }
                if (l1 != null || l2 != null || carry == 1) {
                    output.next = new ListNode();
                    output = output.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a2 = new ListNode(9, new ListNode(9));
        ListNode a1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));
        Solution sol = new Solution();
        ListNode output = sol.addTwoNumbers(a1, a2);
        while (output != null) {
            System.out.println(output.val);
            output = output.next;
        }
    }
}