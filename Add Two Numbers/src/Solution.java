/*
2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

public class Solution {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode result = new ListNode(0);
		//sentinel for listnodes that reach final node
		ListNode sentinel = new ListNode(0);
		
		//travelers for input and result
		ListNode trav1 = l1;
		ListNode trav2 = l2;
		ListNode travResult = result;
		
		//condition if sum of two nodes is greater than 9
		boolean carrytheone = false;
		
		while (trav1 != sentinel || trav2 != sentinel) {
			int sum = trav1.val + trav2.val + travResult.val;

			if (sum > 9) {
				carrytheone = true;
				sum -= 10;
			}
			
			travResult.val = sum;
			//send the carried one to the result's next node
			if (carrytheone) {
				travResult.next = new ListNode(1);	
				carrytheone = false;
			} 
			//if there are more more nodes in either list, but no carried one, set result's next val to 0
			else if (trav1.next != null || trav2.next != null) {
				travResult.next = new ListNode(0);
			} 
			//no more nodes to add, return result
			else {
				return result;
			}
			
			//move to the next node
			travResult = travResult.next;
			if (trav1.next == null) {
				trav1 = sentinel;
			} else {
				trav1 = trav1.next;
			}
			if (trav2.next == null) {
				trav2 = sentinel;
			} else {
				trav2 = trav2.next;
			}
		}
		return result;
	}

}
