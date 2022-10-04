package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		int missedAttempts = 0;

		while (missedAttempts < 5 ){
			System.out.print("Enter path of file or directory ('q' to quit): ");
			String path = userInput.nextLine();
			if (path.equals("q")){
				break;
			}

			File f = new File(path);

			//** examine file system **
			if (f.exists()) {
				System.out.println("name: " + f.getName());
				System.out.println("relativePath: " + f.getPath());
				System.out.println("getCanonicalPath: " + f.getCanonicalPath());
				System.out.println("absolutePath: " + f.getAbsolutePath());

				String fileType = f.isDirectory() ? "directory" : "file";
				System.out.printf("type: %s \n", fileType);

				System.out.println("size: " + f.length());
				missedAttempts = 0;
			} else {
				missedAttempts++;
				System.out.println(f.getPath() + " does not exist.");
			}
			System.out.println();
			System.out.println("===================");
			System.out.println();
		}
	}
}
