package Adapter.TranslationServices.external;

import java.util.List;

public class GoogleTranslateApi {
    public String convert(GoogleTranslationRequest request) {
        return "Translated text";
    }

    public List<String> getLanguages() {
        return List.of("hindi", "marathi", "kannada");
    }
}
