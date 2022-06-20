/**
 * pHray_sc
 * Copyright (c) 1970-2022 All Rights Reserved
 */
package com.own.sccc.algorithm;

/**
 * 翻转链表
 *
 * @author Phray
 * @Version ReverseList.java, v 0.1 2022-06-19 22:45 Sccc Exp $
 */

import java.util.Objects;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class ReverseListSolution {

	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		ListNode tmp;
		while (Objects.nonNull(cur)) {
			tmp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = tmp;
		}
		return pre;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {val = x;}
	}
}