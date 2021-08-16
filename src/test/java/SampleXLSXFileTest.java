import com.codeborne.xlstest.XLS;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;

public class SampleXLSXFileTest {


    @Test
    void checkXLSFileContent () throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream stream = classLoader.getResourceAsStream("file_example_XLS_10.xls");
        XLS xlsFile = new XLS(stream);
        Assertions.assertEquals("Mara", xlsFile
                        .excel
                        .getSheetAt(0)
                        .getRow(2)
                        .getCell(1)
                        .getStringCellValue()
                );
    }

}

