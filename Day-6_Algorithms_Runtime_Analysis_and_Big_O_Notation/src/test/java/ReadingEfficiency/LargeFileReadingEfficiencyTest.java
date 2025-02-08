package ReadingEfficiency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;

public class LargeFileReadingEfficiencyTest {

    @Test
    void Test_1() {

     String filePath = "src\\main\\java\\ReadingEfficiency\\1mb-examplefile-com.txt";
    double readTimeFileReader = LargeFileReadingEfficiency.filereader(filePath);

        Assertions.assertTrue(readTimeFileReader > 0);
    }
    @Test
    void Test_2() {

        String filePath = "src\\main\\java\\ReadingEfficiency\\1mb-examplefile-com.txt";
        double readTimeInputStreamReader = LargeFileReadingEfficiency.inputStreamReader(filePath);

        Assertions.assertTrue(readTimeInputStreamReader > 0);
    }
    @Test
    void Test_3() {
        String filePath = "src\\main\\java\\ReadingEfficiency\\1mb-examplefile-com.txt";

        double readTimeFileReader = LargeFileReadingEfficiency.filereader(filePath);
        double readTimeInputStreamReader = LargeFileReadingEfficiency.inputStreamReader(filePath);

        out.print("TimeFileReader : "+readTimeFileReader+ " TimeInputStreamReader : "+readTimeInputStreamReader);
        Assertions.assertTrue(readTimeFileReader > readTimeInputStreamReader);
      }

    }
