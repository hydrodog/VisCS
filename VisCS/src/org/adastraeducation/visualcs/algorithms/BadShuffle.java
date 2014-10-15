package org.adastraeducation.visualcs.algorithms;

public class BadShuffle extends Shuffle {
	public BadShuffle(int n) {
		super(n);
	}
	public void shuffle(int[] x) {
		for (int i = 0; i < x.length; i++) {
			int temp = x[i];
			int rand = Shuffle.r.nextInt(x.length);
			x[i] = x[rand];
			x[rand] = temp;
		}
	}
	public static void main(String[] args) {
		int[] histogram
		BadShuffle b = new BadShuffle(52);
		histogram(x)
	}
}
