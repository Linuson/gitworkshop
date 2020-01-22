package test;

public class ReverseWords {
	
	String reverseString (final String stringToReverse) {
		if ( stringToReverse == null ) {
			return "";
		}
		
		final String splited[] = stringToReverse.split("\\s");
		
		String reversed = "";
		final String delimiter = " ";
		
		for (int i = (splited.length-1) ; i >= 0; i--) {
			reversed += splited[i] + delimiter;			
		}
		
		return reversed;
	}

	public static void main(String[] args) {
		ReverseWords revWords = new ReverseWords();
		
		System.out.println("Reversed words:");
		System.out.println(revWords.reverseString("one two three"));
		System.out.println(revWords.reverseString("3 2  1"));
	}

}
