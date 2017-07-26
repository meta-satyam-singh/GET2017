package oop3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	private String path; // path for the file to read
	private BufferedReader reader;
	List<String> lines = new ArrayList<String>();

	public ReadFile(String path) {
		this.path = path;
	}

	// method to open file for reading
	private void openFile() throws FileNotFoundException {

		reader = new BufferedReader(new FileReader(path));
	}

	// method to read all the lines present in the file
	public String[] readLines() throws IOException {

		try {
			openFile();
			String singleline;
			while ((singleline = reader.readLine()) != null) { // loop to read
																// lines from
																// the file
				lines.add(singleline);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			reader.close();
		}
		return lines.toArray(new String[lines.size()]);

	}
}
