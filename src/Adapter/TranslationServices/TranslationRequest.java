package Adapter.TranslationServices;


public class TranslationRequest {
    private String text; // The text to be translated
    private String sourceLanguage; // The source language of the text
    private String targetLanguage; // The target language for the translation
    private Double confidenceThreshold; // The confidence threshold for the translation

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
