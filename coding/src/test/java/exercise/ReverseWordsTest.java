package exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsTest {

	ReverseWords revWords = new ReverseWords();

	public final static String STRING_1 = "Lumpy potato";
	public final static String STRING_1_REVERTED = "potato Lumpy";
	public final static String STRING_2 = "Reverse these words";
	public final static String STRING_2_REVERTED = "words these Reverse";

	public final static String MSG_INCOR_REVERT = "Incorrectly reverted string";

	@Test
	public void testReverseString() {
		assertEquals(MSG_INCOR_REVERT, STRING_1_REVERTED, revWords.reverseString(STRING_1));
		assertEquals(MSG_INCOR_REVERT, STRING_2_REVERTED, revWords.reverseString(STRING_2));
	}

}
