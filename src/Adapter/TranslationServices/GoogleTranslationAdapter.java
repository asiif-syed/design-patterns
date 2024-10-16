package Adapter.TranslationServices;

import Adapter.TranslationServices.external.GoogleTranslateApi;
import Adapter.TranslationServices.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslationAdapter implements TranslationProviderAdapter{
    private GoogleTranslateApi api;

    public GoogleTranslationAdapter(){
        this.api = new GoogleTranslateApi();
    }
    @Override
    public  String translate(TranslationRequest request){
        GoogleTranslationRequest googleTranslationRequest =  new GoogleTranslationRequest(request.getText(), request.getSourceLanguage(), request.getTargetLanguage(),  request.getConfidenceThreshold());
        return this.api.convert(googleTranslationRequest);
    }
    @Override
    public List<String> getSupportedLanguages(){
        return this.api.getLanguages();
    }
}
