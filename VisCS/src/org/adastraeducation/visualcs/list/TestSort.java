package org.adastraeducation.visualcs.list;
import java.util.Random;

import org.adastraeducation.visualcs.Visualize;


public class TestSort {
	private ArrayObserver ao;
	private int[] x;
	public TestSort(int[] x, ArrayObserver ao) {
		this.x = x;
		this.ao = ao;
	}
	
	public final void insertionSort() {
		if (Visualize.visual) {
			ao.display();
		}
		for (int i = 1; i < x.length; i++) {
			int temp = x[i];
			int j = i - 1;
			if (x[j] > temp) {
				do {
					x[j+1] = x[j];
					if (Visualize.visual) {
						ao.compare(i-1, i);
						ao.copy(i-1, i);
					}
				} while (--j >= 0 && x[j] > temp);
				x[j+1] = temp;
			}
		}
	}
	static Random r = new Random();
	static int[] createRandomArray(int n) {
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++)
			x[i] = r.nextInt(100);
		return x;
	}
	static void display(int[] x) {
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		System.out.println();
	}
	public static void main(String args[]) {
		//int[] x = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int [] x = createRandomArray(10);
		//if (x.length < 20) display(x);
		ArrayObserver ao = new TextArrayDisplayer(x);
		long t0 = System.currentTimeMillis();
		TestSort ts1 = new TestSort(x, ao);
		ts1.insertionSort();
		long t1 = System.currentTimeMillis();
		System.out.println(t1-t0);
		/*
		x = createRandomArray(100000);
		t0 = System.currentTimeMillis();
		TestSort ts2 = new TestSort(x, ao);
		ts2.insertionSort();
		t1 = System.currentTimeMillis();
		System.out.println(t1-t0);
		*/	
	}
}
