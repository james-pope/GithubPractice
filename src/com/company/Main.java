package com.company;

public class Main {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 11);                    // random int between [0,10]
		int y = (int) (Math.random() * (6 - 1) + 1) + 1;            // simulate a die [1,6]
		int z = (int) (Math.random() * 2);                    // simulate a coin flip
		int dice1 = (int) (Math.random() * (6 - 1) + 1) + 1;        // simulate pair of dice
		int dice2 = (int) (Math.random() * (6 - 1) + 1) + 1;        // simulate pair of dice
		int c = (int) (Math.random() * (100 - 65) + 1) + 65;        // passing grade [65, 100]
		double d = (Math.random() * (10 - 1));                // random decimal [1,10]
		System.out.println(d);
	}
}