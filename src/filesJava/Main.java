package filesJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	private static void saveFile(String file) {
		 try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
			writer.write(file);
			System.out.println("Saved successfully.");
		 } catch (IOException e) {
			 e.printStackTrace();
			 System.out.println("An error occurred while trying to save the file.");
		 }
	}
	
	private static String loadFile() {
		try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
			
			StringBuilder file = new StringBuilder();
			
			String line;
			
			while((line = reader.readLine()) != null) {
				file.append(line);
				file.append("\n");
			}
			
			return file.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("An error occurred while trying to save the file.");
			return "";
		}
	}

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

					saveFile(file);

					System.out.println();

					break;

				case 2:

					file = loadFile();
					System.out.println("file: " + file);

					System.out.println();

					break;

				case 3:

					if (file == "") {
						System.out.println("The file is empty");
					} else {
						file = "";
						System.out.println("Deleted file");

						saveFile(file);
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
