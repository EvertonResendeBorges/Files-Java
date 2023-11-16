package filesJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner s = new Scanner(System.in)) {

			String file = "";
			int option = -1;

			while (option != 0) {

				System.out.println("0- Exit");
				System.out.println("1- Create new file");
				System.out.println("2- Read file");
				System.out.println("3- Delete file \n");

				while (!s.hasNextInt()) {
					System.out.println("Enter a valid option. \n");

					System.out.println("0- Exit");
					System.out.println("1- Create new file");
					System.out.println("2- Read file");
					System.out.println("3- Delete file \n");

					s.next();
				}

				option = s.nextInt();
				s.nextLine();

				System.out.println("");

				switch (option) {

				case 0:

					System.out.println("Program closed.");

					break;

				case 1:

					System.out.println("New file:");
					file = s.nextLine();

					System.out.println();

					break;

				case 2:

					System.out.println("file: " + file);

					System.out.println();

					break;

				case 3:

					if (file == "") {
						System.out.println("The file is empty");
					} else {
						file = "";
						System.out.println("Deleted file");
					}

					System.out.println();

					break;

				default:

					System.out.println("Enter a valid option. \n");

				}
			}

		}

	}

}
