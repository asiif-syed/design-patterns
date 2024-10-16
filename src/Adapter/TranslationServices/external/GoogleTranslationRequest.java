package Adapter.TranslationServices.external;

public class GoogleTranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;
    public GoogleTranslationRequest(String text, String sourceLanguage, String targetLanguage, Double confidenceThreshold ){
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        this.confidenceThreshold = confidenceThreshold;
    }
    public String getText(){
        return this.text;
    }

    public String getSourceLanguage(){
        return this.sourceLanguage;
    }

    public String getTargetLanguage(){
        return this.targetLanguage;
    }

    public Double getConfidenceThreshold(){
        return this.confidenceThreshold;
    }
}
