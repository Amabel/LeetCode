
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		ListNode ret = null;
		ListNode currentNode = ret;
		
		// first element
		if (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				ret = new ListNode(l1.val);
				l1 = l1.next;
				currentNode = ret;
			} else {
				ret = new ListNode(l2.val);
				l2 = l2.next;
				currentNode = ret;
			}
		}
		
		// remaining elements
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				currentNode.next = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				currentNode.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			currentNode = currentNode.next;
		}
		
		// l1 reaches the end
		while (l1 == null && l2 != null) {
			currentNode.next = new ListNode(l2.val);
			l2 = l2.next;
			currentNode = currentNode.next;
		}
		
		while (l1 != null && l2 == null) {
			currentNode.next = new ListNode(l1.val);
			l1 = l1.next;
			currentNode = currentNode.next;
		}
		
		return ret;
	}
	
	static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		
		// dummy
		ListNode ret = new ListNode(0);
		ListNode currentNode = ret;
		
		// remaining elements
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				currentNode.next = new ListNode(l1.val);
				l1 = l1.next;
			} else {
				currentNode.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			currentNode = currentNode.next;
		}
		
		// l1 reaches the end
		while (l1 == null && l2 != null) {
			currentNode.next = new ListNode(l2.val);
			l2 = l2.next;
			currentNode = currentNode.next;
		}
		
		while (l1 != null && l2 == null) {
			currentNode.next = new ListNode(l1.val);
			l1 = l1.next;
			currentNode = currentNode.next;
		}
		
		return ret.next;
	}
	
	static void printList(ListNode l) {
		while (l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}
		System.out.println();
	}

}

class ListNode {
	
	int val;
	ListNode next;
	
	ListNode(int x) {
		val = x;
	}
	
}
