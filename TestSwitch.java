
public class TestSwitch {
	// Program that implements a switch-case to choose the right day of the week
	public static void main(String[] args) {
		int day = 4;
		String dayString = "";
		
		switch (day) {
		case 1: dayString = "Monday";
			break;
		case 2: dayString = "Tuesday";
			break;
		case 3: dayString = "Wednesday";
			break;
		case 4: dayString = "Thursday";
			break;
		case 5: dayString = "Friday";
			break;
		case 6: dayString = "Saturday";
			break;
		case 7: dayString = "Sunday";
			break;
		default: System.out.println("The input is invalid.");
			System.exit(1);
		}
		
		System.out.println("The day is " + dayString + ".");
		
	}

}
