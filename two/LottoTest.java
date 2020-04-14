package com.two;

import java.util.Random;

public class LottoTest {
	public static void main(String[] args) {
		Random ran = new Random();

		int intArray[] = new int[6]; 

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = ran.nextInt(45) + 1;
			System.out.print(intArray[i] + " ");

		}
	}
}
