import java.util.Scanner;


public class HelloArray extends Exercise {

	@Override
	public void runMe(Scanner keyboard) {
		int[] ints = new int[4];
		ints[0] = 3;
		ints[1] = 2;
		ints[2] = 1;
		ints[3] = 0;
		
		// Note that the above array can also be declared as
		ints = new int[]{3, 2, 1, 0};
		
		System.out.println("Array of 4 integers: ");
		for(int i = 0; i < ints.length; i++) {
			System.out.println(String.format("Element %d: %d", i, ints[i]));
		}
	}

}
