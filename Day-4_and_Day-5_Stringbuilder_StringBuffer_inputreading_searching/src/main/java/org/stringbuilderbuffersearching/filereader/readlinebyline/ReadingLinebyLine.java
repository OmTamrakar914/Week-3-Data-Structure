package org.stringbuilderbuffersearching.filereader.readlinebyline;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingLinebyLine {
    public static void main(String[]args){
        // Storing file path

        String filePath = "./src\\main\\java\\org\\stringbuilderbuffersearching\\filereader\\readlinebyline\\sample1.text";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null){
                //Reading line by line
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
