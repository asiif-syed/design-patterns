package Factory.DocumentProcessor;

public abstract class DocumentProcessor {
    protected String documentName;

    public DocumentProcessor(String name){
        this.documentName = name;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract  void processDocument();
    public abstract DocumentType supportsType();
}
