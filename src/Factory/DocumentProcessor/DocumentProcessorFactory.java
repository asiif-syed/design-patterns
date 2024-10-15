package Factory.DocumentProcessor;

public class DocumentProcessorFactory {
    public static DocumentProcessor createDocumentProcessor(String documentName, DocumentType docType){
        switch (docType){
            case TEXT:
                return new TextDocumentProcessor(documentName);
            case SPREAD_SHEET:
                return new SpreadsheetDocumentProcessor(documentName);
            case PRESENTATION:
                return new PresentationDocumentProcessor(documentName);
            default:
                return null;
        }
    }
}
