package Factory.DocumentProcessor;

public class SpreadsheetDocumentProcessor extends DocumentProcessor{
    public SpreadsheetDocumentProcessor(String name){
        super(name);
    }

    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }

    public void processDocument() {
        // Implement presentation document processing logic
        System.out.println("Processing a presentation document: " + getDocumentName());
        // Additional logic for presentation document processing
    }
}
