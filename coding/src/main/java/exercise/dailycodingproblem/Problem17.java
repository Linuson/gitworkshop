package exercise.dailycodingproblem;

import java.util.Arrays;

/**
 * 
 * Good morning! Here's your coding interview problem for today.
 * 
 * This problem was recently asked by Google.
 * 
 * Given a list of numbers and a number k, return whether any two numbers from
 * the list add up to k.
 * 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
 * 17.
 * 
 * Bonus: Can you do this in one pass?
 * 
 * @author Linus
 *
 */

public class Problem17 {

	static boolean checkTwoElementsSum(final int checkedList[], final int k) {

		final int listLength = checkedList.length;
		// System.out.println("listLength: " + listLength);

		if (listLength < 2) {
			return false;
		}

		for (int i = 0; i < listLength; i++) {
			for (int j = 0; j < listLength; j++) {
				if (i == j) {
					continue;
				}

				if ((checkedList[i] + checkedList[j]) <= k) {
					System.out.println(checkedList[i] + "+" + checkedList[j] + "<=" + k);
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int checkedList[] = { 10, 15, 3, 7 };
		int k = 17;

		System.out.println("Check for " + Arrays.toString(checkedList) + " and " + k + " is: "
				+ checkTwoElementsSum(checkedList, k));
		
		String text = "12345";
		System.out.println(text.substring(0,3));
	}
}
