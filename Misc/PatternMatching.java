import java.util.regex.*;

public class PatternMatching {

	public static void main(String[] args) {
		// Write a program that can find all the occurrences of "CAA" and "CTG" 
		// in the following String. Use Pattern Matching.
		String input = "ACAAGATGCCATTGTCCCCCGGCCTCCTGCTGCTGCTGCTCTCCGGGGCCACGGCCACCGCTGCCCTGCC";
		String regex1 = "CAA";
		String regex2 = "CTG";
		
		Pattern pattern1 = Pattern.compile(regex1,Pattern.CASE_INSENSITIVE);
		Matcher matcher1 = pattern1.matcher(input);
		Pattern pattern2 = Pattern.compile(regex2,Pattern.CASE_INSENSITIVE);
		Matcher matcher2 = pattern2.matcher(input);
		
		boolean found = false;
		while (matcher1.find()) {
			System.out.println("Pattern " + matcher1.group() + " found starting at " + matcher1.start() + " and ending at " + matcher1.end());
			found = true;		
		}
		while (matcher2.find()) {
			System.out.println("Pattern " + matcher2.group() + " found starting at " + matcher2.start() + " and ending at " + matcher2.end());
			found = true;		
		}
		
		if (!found) {
			System.out.println("No match found");
		}
		
	}

}
