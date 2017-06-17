package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import solutions.AddTwoNumbers;
import solutions.ListNode;

public class TestAddTwoNumbers {

	AddTwoNumbers atn;
	
	int[] a1_1 = {2, 4, 3};
	int[] a2_1 = {5, 6, 4};
	ListNode l1_1 = createListNode(a1_1);
	ListNode l2_1 = createListNode(a2_1);
	int[] ans_1 = {7, 0, 8};
	ListNode ans_l_1 = createListNode(ans_1);
	
	int[] a1_2 = {1, 1};
	int[] a2_2 = {0, 1, 2};
	ListNode l1_2 = createListNode(a1_2);
	ListNode l2_2 = createListNode(a2_2);
	int[] ans_2 = {1, 2, 2};
	ListNode ans_l_2 = createListNode(ans_2);
	
	
	@Before
	public void setUp() throws Exception {
		atn = new AddTwoNumbers();
	}

	@Test
	public void test() {

	}
	
	public ListNode createListNode(int[] array) {
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		
		for (int v : array) {
			current.next = new ListNode(v);
			current = current.next;
		}
		
		return dummy.next;
	}

}
