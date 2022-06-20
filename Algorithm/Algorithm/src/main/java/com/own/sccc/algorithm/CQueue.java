/**
 * pHray_sc
 * Copyright (c) 1970-2022 All Rights Reserved
 */
package com.own.sccc.algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 用两个栈实现队列
 *
 * @author Phray
 * @Version CQueue.java, v 0.1 2022-06-19 22:12 Sccc Exp $
 */
class CQueue {

	private final Deque<Integer> skIn;
	private final Deque<Integer> skOut;

	public CQueue() {
		skIn = new ArrayDeque<>();
		skOut = new ArrayDeque<>();
	}

	public void appendTail(int value) {
		skIn.push(value);
	}

	public int deleteHead() {
		if (!skOut.isEmpty()) {
			return skOut.pop();
		} else {
			while (!skIn.isEmpty()) {
				skOut.push(skIn.pop());
			}
			return skOut.isEmpty() ? -1 : skOut.pop();
		}
	}
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */