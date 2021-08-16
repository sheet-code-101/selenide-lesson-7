import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.util.Iterator;

public class SampleXLSXFileTest {

    static final String XLSX_FILE_PATH = "src/test/resources/samplexlsx.xlsx";

    @Test
    void checkSampleXLSXFileContentTest() throws Exception {
            //get the excel sheet file location
            FileInputStream fis = new FileInputStream(XLSX_FILE_PATH);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            //  XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFSheet sheet = workbook.getSheetAt(0);
            //get the total row count in the excel sheet
            Iterator<Row> iterator = sheet.rowIterator();
            int cellIndex = 0;
            String description = null;
            while (iterator.hasNext()) {
                Row row = iterator.next();
                for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                    Cell cell = row.getCell(i);
                    //print the cell value
                    System.out.println(i + " " +cell);
                }
            }
        }


}