package solutions;

public class AddTwoNumbers {

    public static void main(String[] args) {
//        l1.next = new ListNode(4);
    	
    	AddTwoNumbers atn = new AddTwoNumbers();
    	
    	int[] a1_1 = {2, 4, 3};
    	int[] a2_1 = {5, 6, 4};
    	ListNode l1_1 = createListNode(a1_1);
    	ListNode l2_1 = createListNode(a2_1);
    	int[] ans_1 = {7, 0, 8};
    	ListNode ans_l_1 = atn.solution(l1_1, l2_1);
    	ListNode ans_l1_1 = createListNode(ans_1);
    	
    	System.out.println("equals: " + equalsListNode(ans_l1_1, ans_l_1));
    	
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
	
//	public static void dumpListNode(ListNode l) {
//		if (null == l) {
//			return;
//		}
//		do {
//			System.out.print(l.val);
//		} while (null != l.next);
//		
//		System.out.println();
//		
//	}
	
	public static boolean equalsListNode(ListNode l1, ListNode l2) {
		ListNode ln1 = l1;
		ListNode ln2 = l2;
		
		while (null != ln1.next && null != ln2.next) {
			if (ln1.val != ln2.val) {
				return false;
			}
			ln1 = ln1.next;
			ln2 = ln2.next;
		}
		
		if (null == ln1.next && null == ln2.next) {
			return true;
		}
		
		return false;
	}
}
