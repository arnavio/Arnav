package games;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Game1 {

	public static void main(String[] args) throws IOException {

		File file = new File("/Users/Arnav/Documents/JrJavaMacNeon/eclipseWS/Arnav/src/Foo.txt");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		String text = null;
		int score=0;
		text = reader.readLine();
		score =Integer.parseInt(text);
		System.out.println(text);
		text = reader.readLine();
		System.out.println(text);

		PrintWriter writer = new PrintWriter("/Users/Arnav/Documents/JrJavaMacNeon/eclipseWS/Arnav/src/Foo.txt");
		writer.println("The first line");
		writer.println("The second line");
		writer.close();
	}

}
