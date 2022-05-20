import com.spire.doc.Document;
import com.spire.doc.FileFormat;

import java.net.URI;
import java.net.URISyntaxException;

public class WordToPdf {
    public static void main(String[] args) throws URISyntaxException {
        //Загрузить образец документа Word
        Document document = new Document();
        document.loadFromFile("src/main/resources/files/convert.docx");
        //Сохранить как PDF
        document.saveToFile("src/main/resources/files/convertedPDF.pdf", FileFormat.PDF);
    }
}
