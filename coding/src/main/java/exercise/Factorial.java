package exercise;

/*
 * Factorial test
 */

public class Factorial {
	
	int countFact (final int num) {	
		if ( num > 1 ) {
			return(num*countFact(num-1));
			//System.out.println(res);
		}	
		
		return 1;
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		
		int num=4;
		System.out.println("Recursive:");
		System.out.println(num+"!=" + fact.countFact(num));
		
		int res = 1;
		int curNum = num;
		while ( curNum > 1 ) {
			res*=curNum;
			curNum--;
		}
		
		System.out.println("Non-Recursive:");
		System.out.println(num+"!=" + res);
	}

}
