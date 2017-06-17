package solutions;

public class AddTwoNumbers {

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        ListNode res = new Solution().addTwoNumbers(l1, l2);
//        System.out.println(res.val + "" + res.next.val + "" + res.next.next.val);
    	
    	AddTwoNumbers atn = new AddTwoNumbers();
    	
    	int[] a1_1 = {2, 4, 3};
    	int[] a2_1 = {5, 6, 4};
    	ListNode l1_1 = createListNode(a1_1);
    	ListNode l2_1 = createListNode(a2_1);
//    	int[] ans_1 = {7, 0, 8};
    	ListNode ans_l_1 = atn.solution(l1_1, l2_1);
    	dumpListNode(ans_l_1);
    	
//    	int[] a1_2 = {1, 1};
//    	int[] a2_2 = {0, 1, 2};
//    	ListNode l1_2 = createListNode(a1_2);
//    	ListNode l2_2 = createListNode(a2_2);
////    	int[] ans_2 = {1, 2, 2};
//    	ListNode ans_l_2 = atn.solution(l1_2, l2_2);
//    	dumpListNode(ans_l_2);
    	
    }

    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2;
        ListNode current = result;
        int carry = 0;

        while (null != p || null != q) {
            int x = (null != p) ? p.val : 0;
            int y = (null != q) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (null != p) {
                p = p.next;
            }
            if (null != q) {
                q = q.next;
            }
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return result.next;
    }
    
	public static ListNode createListNode(int[] array) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		
		for (int v : array) {
			current.next = new ListNode(v);
			current = current.next;
		}
		current.next = null;
		
		return dummy.next;
	}
	
	public static void dumpListNode(ListNode l) {
		if (null == l) {
			return;
		}
		do {
			System.out.print(l.val);
		} while (null != l.next);
		
		System.out.println();
		
	}
}
