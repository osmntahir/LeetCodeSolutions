import java.util.LinkedList;

/*
*  Palindrome Linked List
Easy
Topics
Companies
Given the head of a singly linked list, return true if it is a
palindrome
 or false otherwise.



Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public boolean isPalindrome(ListNode head) {
        // Create a temporary LinkedList to store values of the linked list
        LinkedList<Integer> temp = new LinkedList<Integer>();

        // Traverse the linked list and add each node's value to the temporary LinkedList
        while (head != null) {
            temp.add(head.val);
            head = head.next;
        }

        // Initialize two pointers for checking palindrome
        int Start = 0;
        int End =temp.size() - 1;

        // Check if the values at the corresponding positions are equal
        while (End > Start) {
            if (temp.getFirst() != temp.getLast()) {
                // If values are not equal, the linked list is not a palindrome
                return false;
            } else {
                // Move the pointers and remove the compared values from the temporary LinkedList
                End--;
                Start++;
                temp.removeFirst();
                temp.removeLast();

                // If pointers meet or cross, the linked list is a palindrome
                if (Start > End)
                    return true;
            }
        }

        // If the loop completes, the linked list is a palindrome
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sl = new Solution();
        ListNode node = new ListNode();
        node.val = 1;
        node.next = new ListNode();
        node.next.val=1;
        node.next.next = new ListNode();
        node.next.next.val = 2;
        node.next.next.next = new ListNode();
        node.next.next.next.val = 1;

        System.out.println(sl.isPalindrome(node));
    }
}
