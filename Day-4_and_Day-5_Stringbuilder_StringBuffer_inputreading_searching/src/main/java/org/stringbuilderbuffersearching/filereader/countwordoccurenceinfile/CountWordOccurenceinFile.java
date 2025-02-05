package org.stringbuilderbuffersearching.filereader.countwordoccurenceinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurenceinFile {

    public static void main(String[]args) {

        //storing file path
        String filePath = "./src\\main\\java\\org\\stringbuilderbuffersearching\\filereader\\countwordoccurenceinfile\\sample2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                //reading the line by line

                String[] words = line.split(" ");

                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals("The")) {
                        count++;
                    }
                }
            }
            System.out.println("The total occurence of word \"The\" is + " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
