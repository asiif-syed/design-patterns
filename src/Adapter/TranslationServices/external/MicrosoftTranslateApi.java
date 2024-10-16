package Adapter.TranslationServices.external;

import java.util.List;

public class MicrosoftTranslateApi {
    public String translate(String text, String sourceLanguage, String targetLanguage) {
        return "Translated text";
    }

    // Method to retrieve the list of supported languages from Microsoft Translator
    public List<String> getSupportedLanguages() {
        return List.of("hindi", "marathi", "kannada");
    }
}
