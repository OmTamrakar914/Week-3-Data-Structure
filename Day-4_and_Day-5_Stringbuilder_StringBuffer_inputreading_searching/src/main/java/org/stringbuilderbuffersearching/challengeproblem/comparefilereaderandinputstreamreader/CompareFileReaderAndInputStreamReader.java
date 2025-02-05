package org.stringbuilderbuffersearching.challengeproblem.comparefilereaderandinputstreamreader;

import static java.lang.System.*;

import java.io.*;

public class CompareFileReaderAndInputStreamReader {

    public static void compareFileReaderAndInputStreamReader() {
        String filePath = "src\\main\\java\\org\\stringbuilderbuffersearching\\challengeproblem\\comparefilereaderandinputstreamreader\\100mb-examplefile-com.txt";
        long startTime = 0, endTime = 0;
        //testing fileReader
        startTime = System.nanoTime();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {

                String[] words = line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    count++;
                }
            }
            endTime = System.nanoTime();

            out.println("The FileReader time is : " + (endTime - startTime));
            out.println("The Number of the words in the file is : " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //testing InputStreamReader
        startTime = System.nanoTime();
        try ( BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {

            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {

                String[] words = line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    count++;
                }
            }
            endTime = System.nanoTime();
            out.println("The FileReader time is : " + (endTime - startTime));
            out.println("The Number of the words in the file is : " + count);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[]args){
        compareFileReaderAndInputStreamReader();
    }

}
