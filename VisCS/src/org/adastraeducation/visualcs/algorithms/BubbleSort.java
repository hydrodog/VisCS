package org.adastraeducation.visualcs.algorithms;

import org.adastraeducation.visualcs.VisualCS;
import org.adastraeducation.visualcs.list.*;

public class BubbleSort implements Sort {
	private static ArrayDisplayer a;
	
	public void sort(int[] x) {
		for (int i = x.length-1; i > 1; i--)
			for (int j = 0; j < i; j++) {
				if (VisualCS.visualize)
					a.compare(j, j+1);
				if (x[j] > x[j+1]) {
					int temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
					if (VisualCS.visualize)
						a.swap(j, j+1);
				}
			}
	}
	public static void main(String[] args) {
		int[] arr = { 9, 1, 8, 2, 7, 3, 6, 5 };
		BubbleSort s = new BubbleSort();
		a = new TextArrayDisplayer(arr);
		s.sort(arr);
		a.display();
	}
}
