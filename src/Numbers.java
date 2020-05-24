import java.util.Scanner;

public class Numbers {
	
	private Float[] numbers;
	private int numItems = 0;
	
	public Numbers() {
		numbers = new Float[5];
	}

	public Numbers(int size) {
		numbers = new Float[size];
	}

	public void addValue(Scanner keyboard) {

		if (numbers.length == numItems) {
			System.out.println("Array is full");
		}
		if (numbers.length != numItems) {
			try {

				System.out.print("Enter value: ");
				float x = keyboard.nextFloat();
				if (x < Float.MAX_VALUE) {
				numbers[numItems] = x;		
				numItems++;
				} else {
					System.out.println("Number Enter is too large, Please try again!");
				}
			} catch (Exception e) {
				System.out.println("Invalid Entry - Please try again\n");
				keyboard.nextLine();
			}
		}
	}

	public float calcAverage() {

		float total = 0;

		if (numItems == 0) {
			System.out.print("Average is: ");
			System.out.println(numItems);
			return (float) 0.0;
		}

		for (int i = 0; i < numItems; i++) {
			total = total + numbers[i];
		}
		
		System.out.print("Average is: ");
		System.out.println(total / numItems);

		return (float) 0.0;
	}

	@Override
	public String toString() {
		System.out.println("Numbers are: ");

		for (int i = 0; i < numItems; i++) {

			System.out.println(numbers[i]);
		}
		return "";
	}

}
