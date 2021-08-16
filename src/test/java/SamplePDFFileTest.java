import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class SamplePDFFileTest {

    static final String PDF_FILE_PATH = "src/test/resources/samplepdf.pdf";

    @Test
    void checkSamplePDFFileContentTest() throws Exception {
        String pdfContent;
        PDDocument document = PDDocument.load(new File(PDF_FILE_PATH));
        if (!document.isEncrypted()) {
            PDFTextStripper stripper = new PDFTextStripper();
            pdfContent = stripper.getText(document);
            System.out.println(pdfContent);
            Assertions.assertTrue(pdfContent.contains("column A column B"));
        }
        document.close();
    }
}
