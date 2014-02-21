import java.util.Scanner;


public class UserNum extends Exercise {
	
	public void runMe(Scanner keyboard) {
		System.out.print("Please enter a number: ");
		
		int userNum = keyboard.nextInt();
				
		String output = String.format("You entered: %d", userNum);
		System.out.println(output);
	}

}
