package Adapter.TranslationServices;

import Adapter.TranslationServices.external.GoogleTranslateApi;
import Adapter.TranslationServices.external.GoogleTranslationRequest;
import Adapter.TranslationServices.external.MicrosoftTranslateApi;

public class TranslationManager {
    private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();
    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {
//    Without adapter we need to perform conversions by doing multiple checks
        if (provider.equals("google")) {
            GoogleTranslationRequest request = new GoogleTranslationRequest(text, sourceLanguage, targetLanguage, 0.8);
            return googleTranslateApi.convert(request);
        } else if (provider.equals("microsoft")) {
            return microsoftTranslateApi.translate(text, sourceLanguage, targetLanguage);
        } else {
            throw new RuntimeException("Invalid provider");
        }
    }
}
