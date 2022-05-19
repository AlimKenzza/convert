import com.spire.doc.Document;
import com.spire.doc.FileFormat;

public class WordToPdf {
    public static void main(String[] args) {
        //Загрузить образец документа Word
        Document document = new Document();
        document.loadFromFile("C://Users/Alimzhan/Desktop/edocument.docx");


        //Сохранить как PDF
        document.saveToFile("C://Users/Alimzhan/Desktop/convertedPDF.pdf", FileFormat.PDF);
    }
}
