/*
21. Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

*/
public class Solution {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}


	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		
		ListNode result = new ListNode(0);
		
		//traveler nodes to iterate through each List
		ListNode trav1 = l1;
		ListNode trav2 = l2;
		ListNode travResult = result;
		
		//sentinel to mark end of List
		ListNode sentinel = new ListNode(0);
		
		//check to see if result's first val has been set
		boolean firstValFilled = false;

		if (trav1 == null && trav2 == null) {
			return null;
		}

		if (trav1 == null) {
			trav1 = sentinel;
		}

		if (trav2 == null) {
			trav2 = sentinel;
		}

		//loop until trav1 & trav2 == sentinel
		while (trav1 != sentinel || trav2 != sentinel) {
			//if neither trav == sentinel, pick the lowest value and assign it to the result node.  If equal, use trav1's.
			//if one of the lists == sentinel, iterate through the other list until it reaches the end
			if (((trav1.val <= trav2.val) && trav1 != sentinel) || trav2 == sentinel) {
				if (firstValFilled) {
					ListNode n = new ListNode(0);
					travResult.next = n;
					travResult = travResult.next;
				} else {
					firstValFilled = true;
				}
				travResult.val = trav1.val;
				if (trav1.next == null) {
					trav1 = sentinel;
				} else {
					trav1 = trav1.next;
				}
			} else {
				if (firstValFilled) {
					ListNode n = new ListNode(0);
					travResult.next = n;
					travResult = travResult.next;
				} else {
					firstValFilled = true;
				}
				travResult.val = trav2.val;
				if (trav2.next == null) {
					trav2 = sentinel;
				} else {
					trav2 = trav2.next;
				}
			}
		}
		return result;
	}

}