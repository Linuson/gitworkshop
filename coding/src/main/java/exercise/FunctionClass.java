package exercise;

public class FunctionClass {
	public static final String SPACE_REGEX = "\s";	

	public static void main(String[] args) {
		FunctionClass fc = new FunctionClass();

		String str = "Lumpy potato";
		System.out.println(fc.reverseWordsInString(str));
		str = "I am a coder";
		System.out.println(fc.reverseWordsInString(str));
		str = "Reverse these words";
		System.out.println(fc.reverseWordsInString(str));
	}

	private String reverseWordsInString(final String str) {
		String[] splittedStr = str.split(SPACE_REGEX);
		
		String revertedStr = "";
		
		for (int i = (splittedStr.length-1); i >= 0 ; i--) {
			revertedStr += splittedStr[i] + SPACE_REGEX;			
		}
		
		return revertedStr.trim();
	}
}
