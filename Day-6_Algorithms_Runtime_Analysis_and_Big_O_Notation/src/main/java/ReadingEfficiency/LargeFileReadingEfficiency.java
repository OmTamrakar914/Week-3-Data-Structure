package ReadingEfficiency;
import static java.lang.System.*;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargeFileReadingEfficiency {

    //FileReader
    public static double filereader(String filePath){
        double startTime, endTime;
        String filepath = filePath;

        startTime = System.nanoTime();
        try(FileReader reader = new FileReader(filePath)){
            int i;char c;
            while((i=reader.read()) != -1){
                c=(char)i;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        endTime = System.nanoTime();
        return (endTime-startTime);
    }

    //InputStreamReader
    public static double inputStreamReader(String filePath){
        double startTime, endTime;
        String filepath = filePath;
        startTime = System.nanoTime();
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(filepath))){
            int i; char c;
            while((i = isr.read()) != -1){
                c = (char)i;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        endTime = System.nanoTime();
        return (endTime-startTime);
    }

    public static void main(String[]args){

        int arr[] = {1,100,500};

        for(int arrs : arr){
            if(arrs == 1){
                String file = "src\\main\\java\\ReadingEfficiency\\1mb-examplefile-com.txt";

                out.println("The Time taken by FileReader and InputStreamreader when file is of "+arrs+" mb");
                double startTime, endTime;

                startTime = System.nanoTime();
                filereader(file);
                endTime = System.nanoTime();
                out.println("Time Taken by fileReader is        : "+(endTime-startTime)+" ms");

                startTime = System.nanoTime();
                inputStreamReader(file);
                endTime = System.nanoTime();
                out.println("Time Taken by InputStreamReader is : "+(endTime-startTime)+" ms");

            } else if (arrs == 100) {
                String file = "C:\\Users\\Om\\OneDrive\\Desktop\\CapegeminiPractice\\Week-3-Data_Structure\\Day-6_Algorithms_Runtime_Analysis_and_Big_O_Notation\\src\\main\\java\\ReadingEfficiency\\100mb-examplefile-com.txt";

                out.println("The Time taken by FileReader and InputStreamreader when file is of "+arrs+" mb");
                double startTime, endTime;

                startTime = System.nanoTime();
                filereader(file);
                endTime = System.nanoTime();
                out.println("Time Taken by fileReader is        : "+(endTime-startTime)/1000000+" ms");

                startTime = System.nanoTime();
                inputStreamReader(file);
                endTime = System.nanoTime();
                out.println("Time Taken by InputStreamReader is : "+(endTime-startTime)/1000000+" ms");
            }else {
                String file = "C:\\Users\\Om\\OneDrive\\Desktop\\CapegeminiPractice\\Week-3-Data_Structure\\Day-6_Algorithms_Runtime_Analysis_and_Big_O_Notation\\src\\main\\java\\ReadingEfficiency\\500mb.txt";

                //String filed = "C:\\Users\\Om\\OneDrive\\Desktop\\CapegeminiPractice\\Week-3-Data_Structure\\Day-6_Algorithms_Runtime_Analysis_and_Big_O_Notation\\src\\main\\java\\ReadingEfficiency\\100mb-examplefile-com.txt";

                out.println("The Time taken by FileReader and InputStreamreader when file is of "+arrs+" mb");
                double startTime, endTime;

                startTime = System.nanoTime();
                filereader(file);
                endTime = System.nanoTime();
                out.println("Time Taken by fileReader is        : "+(endTime-startTime)/1000000+" ms");

                startTime = System.nanoTime();
                inputStreamReader(file);
                endTime = System.nanoTime();
                out.println("Time Taken by InputStreamReader is : "+(endTime-startTime)/1000000+" ms");

            }
        }
    }
}
