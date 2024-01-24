/*Given the head of a singly linked list, reverse the list, and return the reversed list.



        Example 1:


        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]
        Example 2:


        Input: head = [1,2]
        Output: [2,1]
        Example 3:

        Input: head = []
        Output: []


        Constraints:

        The number of nodes in the list is the range [0, 5000].
        -5000 <= Node.val <= 5000

        */

// BEST SOLUTION


// my solution

import javax.swing.*;

/**
 * Definition for singly-linked list.
 * */
   class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode reverseList(ListNode head) {
        // Check if the linked list is empty
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next; // Save the next node
            current.next = prev; // Reverse the link

            // Move one step forward in the list
            prev = current;
            current = nextTemp;
        }

        return prev; // Prev is now the new head of the reversed list
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Display the original linked list
        System.out.println("Original list:");
        printList(head);

        // Reverse the linked list using the Solution class
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        // Display the reversed linked list
        System.out.println("Reversed list:");
        printList(reversedHead);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
