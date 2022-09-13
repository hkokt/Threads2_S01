package view;

import contr.threadsip;

public class Principal {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread t = new threadsip(i);
			t.start();
		}
	}
}
