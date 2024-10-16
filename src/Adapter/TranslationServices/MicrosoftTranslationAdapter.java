package Adapter.TranslationServices;

import Adapter.TranslationServices.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslationAdapter implements  TranslationProviderAdapter{
    private MicrosoftTranslateApi api;

    public MicrosoftTranslationAdapter(){
        this.api = new MicrosoftTranslateApi();
    }

    @Override
    public  String translate(TranslationRequest request){
        return this.api.translate(request.getText(), request.getSourceLanguage(), request.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguages(){
        return this.api.getSupportedLanguages();
    }

}
