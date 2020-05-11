import java.util.*;

public class LicenseGen {

	public static void main(String[] args) {
		// Program to generate a random plate number
		Random rndm = new Random();
		char c1 = (char)(rndm.nextInt(26) + 'a');
		char c2 = (char)(rndm.nextInt(26) + 'a');
		char c3 = (char)(rndm.nextInt(26) + 'a');
		char[] chars = {c1,c2,c3};
		String s = new String(chars);
		int num1 = rndm.nextInt(10);
		int num2 = rndm.nextInt(10);
		int num3 = rndm.nextInt(10);
		int num4 = rndm.nextInt(10);
		String lp = "Your License Plate Number is " + s.toUpperCase() + num1 + num2 + num3 + num4;
		System.out.println(lp);

	}

}
