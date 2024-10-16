package Adapter.TranslationServices;
public class TranslationManager {
//    Without using adapter pattern
//    private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();
//    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();
//
//    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {
////    Without adapter we need to perform conversions by doing multiple checks
//        if (provider.equals("google")) {
//            GoogleTranslationRequest request = new GoogleTranslationRequest(text, sourceLanguage, targetLanguage, 0.8);
//            return googleTranslateApi.convert(request);
//        } else if (provider.equals("microsoft")) {
//            return microsoftTranslateApi.translate(text, sourceLanguage, targetLanguage);
//        } else {
//            throw new RuntimeException("Invalid provider");
//        }
//    }
//    Using adapter
        public String translate(String text, String sourceLanguage, String targetLanguage, String provider) throws Exception {
            TranslationProviderAdapter translationService = TranslationAdapterFactory.getTranslationAdapter(provider);
            TranslationRequest request = new TranslationRequest(text, sourceLanguage, targetLanguage, 0.8);
           return translationService.translate(request);
        }

}
