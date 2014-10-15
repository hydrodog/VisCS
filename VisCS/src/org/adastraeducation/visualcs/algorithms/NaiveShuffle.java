package org.adastraeducation.visualcs.algorithms;

public class NaiveShuffle extends Shuffle {
	public NaiveShuffle(int n) {
		super(n);
	}
	public void shuffle(int[] x) {
		int [] shuffled = new int[x.length];
		int pick;
		for (int i = 0; i < x.length; i++) {
			int count = 0;
			do {
			  pick = r.nextInt(x.length);
			  count++;
			} while (x[pick] < 0);
			shuffled[i] = x[pick];
			x[pick] = -1;
			//System.out.println("i=" + i + " count=" + count);
		}
			
		
	}
	public static void main(String[] a) {
 
		int dn = 100;
		final int numTrials = 10;
		for (int n = 100; n < 100000; n *= 10) {
			double meanTime  = 0;
			long t0 = System.currentTimeMillis();
			NaiveShuffle shuf = new NaiveShuffle(n);
			for (int trial = 0; trial < numTrials; trial++) {
				shuf.shuffle(shuf.x);
			}
			long t1 = System.currentTimeMillis();
			meanTime += (t1-t0)/1000.0;
			//meanTime /= numTrials;
			System.out.println("n=" + n + "  time=" + meanTime);
			if (n > 2000)
				dn = 500;
		}
	}
}
