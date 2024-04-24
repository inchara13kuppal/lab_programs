package week11;

import java.io.FileWriter;
import java.io.*;

public class MyFileWriter {
    public static void main(String args[]) throws IOException {

        try {
            FileWriter fw = new FileWriter("TestFile.txt");
            String s = "\nAll the Best for your exams dear Students.\n";
           
            char ch[] = s.toCharArray();
            for (int i = 0; i < ch.length; i++)
                fw.write(ch[i]);
            s = "Good Luck and Prepare Well.";
            fw.write(s);
            fw.close();
            int i = 0;
            FileReader fr = new FileReader("TestFile.txt");
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        } catch (FileNotFoundException nfe) {
            System.out.print("Invalid File Name\nFile does not exist.");
        }
    }
}

