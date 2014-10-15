package org.adastraeducation.visualcs.algorithms;

import java.util.Random;

public abstract class Shuffle {
	protected int[] x;
	protected static Random r;
	static {
		r = new Random(0);
	}
	public Shuffle(int n) {
		x = new int[n];
		init();
	}
	public void init() {
		for (int i = 0; i < x.length; i++)
			x[i] = i;
	}
	/**
	 * Randomly shuffle an array, the array should be in order
	 * @param x
	 */
	public abstract void shuffle(int[] x);
}
