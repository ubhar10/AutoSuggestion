package wordprocess;

import java.io.*;
import java.util.*;

public class TextFile implements Parser {
    private File file;

    public TextFile(File file) {
        this.file = file;
    }

    /*
     * Parse the text file and return the word list that has to added in the Auto Suggestion List.
     */
    public List<String> parse() {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file at the specified path " + file.toString());
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String strLine;
        ArrayList<String> lines = new ArrayList<String>();
        try {
            while ((strLine = reader.readLine()) != null) {
                String lastWord = strLine.substring(strLine.lastIndexOf(" ") + 1);
                lines.add(lastWord.toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
