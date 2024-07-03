package com.java.practice;

import java.util.Arrays;

public class RemoveRepetitiveNumbersFromArray {

	public static void main(String[] args) {

		Integer[] integerArray = { 1, 2, 3, 4, 5, 4, 5, 6, 3, 1 };
		Character[] characterArray = { 'a', 'A', 'b', 'c', 'b', 'A', 'd' };
		String[] stringArray = { "apple", "banana", "apple", "orange" };

		Integer[] newIntegerArray = removeDuplicates(integerArray);
		Character[] newCharacterArray = removeDuplicates(characterArray);
		String[] newStringArray = removeDuplicates(stringArray);

		System.out.println(Arrays.toString(newIntegerArray));
		System.out.println(Arrays.toString(newCharacterArray));
		System.out.println(Arrays.toString(newStringArray));

	}

	public static <T> T[] removeDuplicates(T[] array) {
		return Arrays.stream(array).distinct().toArray(size -> Arrays.copyOf(array, size));
	}

}
