import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Numbers test = new Numbers();
		Scanner scanner = new Scanner(System.in);
		boolean vaild = false;
		int i = 0;
		
		while (vaild == false || i != 6) {

			try {
				vaild = false;
				displayMainMenu();
				i = scanner.nextInt();
	
				if (i > 0 && i < 8) {
					vaild = true;
				} else if (i < 1 || i > 7) {
					System.out.println("Invalid Entry - Please try again\n");
				}
				
				if (vaild == true) {
					switch (i) {
					case 1:
						test = new Numbers();
						break;
					case 2:
						System.out.print("Enter new size of array: ");
						int temp = scanner.nextInt();
						test = new Numbers(temp);
						break;
					case 3:
						test.addValue(scanner);
						break;
					case 4:
						test.toString();
						System.out.println();
						break;
					case 5:
						test.calcAverage();
						break;
					case 6:
						System.out.println("Exiting...");
						break;
					}
				}
			} catch (Exception e) {
				System.out.println("Invalid Entry - Please try again\n");
				scanner.nextLine();
			}
		}
		scanner.close();
	}

	public static void displayMainMenu() {
		System.out.println("Please select one of the following:" + "\n1: Initialize a default array"
				+ "\n2: To specify the max size of the array" + "\n3: Add value to the array"
				+ "\n4: Display values in the array" + "\n5: Display the average of the values" + "\n6: To Exit");
		System.out.print(">");
	}
}
