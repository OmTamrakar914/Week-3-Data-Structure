package org.stringbuilderbuffersearching.inputstreamreader.readuserinput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;

public class ReadUserInputandWrite {
  public static void main(String[]args){

      String filePath = "C:\\Users\\Om\\OneDrive\\Desktop\\CapegeminiPractice\\Week-3-Data_Structure\\Day-4_and_Day-5_Stringbuilder_StringBuffer_inputreading_searching\\src\\main\\java\\org\\stringbuilderbuffersearching\\inputstreamreader\\readuserinput\\sample4.txt";
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          String name="";
          out.println("Enter your name : ");
          FileWriter writer = new FileWriter(filePath,true);
          while(!(name = br.readLine()).equals("exist")){

              out.println("Enter your name : ");
              //fileWriter
              writer.write(" Hello, "+name+"!");
              writer.flush();
          }
      }
      catch (IOException e){
          e.printStackTrace();
      }
  }
}
