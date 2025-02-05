package org.stringbuilderbuffersearching.inputstreamreader.convertbytetocharaterstream;

import javax.imageio.IIOException;
import java.io.*;

public class ConvertByteToCharacterStream {
    public static void main(String[] args){
        String filePath = "./src\\main\\java\\org\\stringbuilderbuffersearching\\inputstreamreader\\convertbytetocharaterstream\\sample3.txt";

        try( FileInputStream fr = new FileInputStream(filePath);
             InputStreamReader is = new InputStreamReader(fr);
             BufferedReader br = new BufferedReader(is)){

            String line;
            while((line = br.readLine())!= null){

                for(char c : line.toCharArray()){
                    System.out.print(c+", ");
                }
                System.out.println();
            }

        }
        catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        catch (FileNotFoundException exception){
            exception.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
