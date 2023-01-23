package JavaConcepts.I_O_File;

import java.io.*;

public class WritingTheFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt"));
        writer.write("Hello I am yash");
        writer.write("\n I am writing this file bufferwriter");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"));
        String line;
        while (reader.readLine() != null)
            System.out.println(reader.readLine());
        reader.close();
    }
}
