package org.adastraeducation.visualcs.list;
import processing.core.*;

//TODO: How does a listobserver work differently?
public class PAppletArrayDisplayer extends ArrayDisplayer {
	private PApplet applet;
	public PAppletArrayDisplayer(int[] arr, PApplet applet) {
		super(arr);
		this.applet = applet;
	}
	
	public void display() {
		int h = 30;
		applet.rect(0, 0, applet.width-1, h);
		int w = applet.width / arr.length;
		for (int x = 0; x < arr.length; x+=w)
			applet.line(x, 0, x, h);
	}
	public void compare(int i, int j) {
	}
	public void rotate(int i, int j, int dir) {
	}
	public void swap(int i, int j) {
	}
	public void grow(int[] newArray, int newSize) {
	}
	public void copy(int from, int to) {
	}
	public void set(int i, int temp) {
	}
}
