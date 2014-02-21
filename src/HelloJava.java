import java.util.HashMap;
import java.util.Scanner;

public class HelloJava {

	private HashMap<String, Exercise> exercises = new HashMap<String, Exercise>();
	
	private void registerExercises() {
		// Register an exercise with the class name as the key
		// and the instance as the value.
		this.exercises.put("UserNum", new UserNum());
		this.exercises.put("HelloArray", new HelloArray());
	}
	
	// Class constructor
	public HelloJava() {
		registerExercises();
	}
	
	public static void main(String[] args) {
		HelloJava hj = new HelloJava();
		
		// Allow the user to select a task
		System.out.println("The following tasks are available: ");
		
		int i = 1;
		for(String ex: hj.exercises.keySet()) {
			System.out.println(String.format("%d. %s", i, ex));
			i++;
		}
		
		System.out.print("Please select a task: ");
		
		Scanner keyboard = new Scanner(System.in);
		int exNum = keyboard.nextInt();
		
		// Execute the appropriate exercise
		i = 1;
		for(String ex: hj.exercises.keySet()) {
			if (i == exNum) {
				// This is the exercise we want. Execute it and then break
				hj.exercises.get(ex).runMe(keyboard);
				break;
			} else {
				i++;
			}
		}
	}

}
