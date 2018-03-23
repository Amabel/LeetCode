import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergekSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static ListNode mergekSortedLists(ListNode[] lists) {
		
		if (lists == null || lists.length == 0) {
			return null;
		}
		
		PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length,(a,b)->a.val-b.val);
		
		ListNode dummy = new ListNode(0);
		ListNode currentNode = dummy;
		
		for (ListNode listNode : lists) {
			if (listNode != null) {
				queue.add(listNode);
			}
		}
		
		while (!queue.isEmpty()) {
			currentNode.next = queue.poll();
			currentNode = currentNode.next;
			if (currentNode.next != null) {
				queue.add(currentNode.next);
			}
		}
		return dummy.next;
	}

}

class ListNode {
	
	int val;
	ListNode next;
	
	ListNode(int x) {
		val = x;
	}
	
}