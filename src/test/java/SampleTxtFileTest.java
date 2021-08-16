import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.InputStream;

public class SampleTxtFileTest {

    static final String TXT_FILE_PATH = "src/test/resources/txtsample.txt";

    @Test
     void checkSampleTxtFileContentTest() throws Exception {
        String s;

        try (InputStream is = new FileInputStream(TXT_FILE_PATH)) {
            s = new String(is.readAllBytes(), "UTF-8");
        }

        Assertions.assertTrue(s.contains("Hello, world!"));
    }

}
