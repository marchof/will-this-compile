/**
 * Five plus signs in a row? Will this compile and if yes, what will be
 * the result?
 */
public class FivePlus {
	
	public static void main(String[] args) {
		
		int x = 20;
		
		int s = x ++ + ++ x;
			
		System.out.println(s);
	
		int y = + + + + + + + + +1;

		System.out.println(y);
		
		int z = - + - + - + - + - + - + 1;
		
		System.out.println(z);
	}

}
