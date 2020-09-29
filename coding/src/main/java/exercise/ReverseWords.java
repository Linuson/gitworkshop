package exercise;

public class ReverseWords {
	
	public static final String SPACE_DELIM = "\s";	
	
	String reverseString (final String stringToReverse) {
		if ( stringToReverse == null ) {
			return "";
		}
		
		final String splited[] = stringToReverse.split(SPACE_DELIM);
		
		String reversed = "";
		
		for (int i = (splited.length-1) ; i >= 0; i--) {
			reversed += splited[i] + SPACE_DELIM;			
		}
		
		return reversed.trim();
	}

	public static void main(String[] args) {
		ReverseWords revWords = new ReverseWords();
		
		System.out.println("Reversed words:");
		System.out.println(revWords.reverseString("one two three"));
		System.out.println(revWords.reverseString("3 2  1"));
	}

}
