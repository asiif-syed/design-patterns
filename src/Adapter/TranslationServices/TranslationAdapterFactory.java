package Adapter.TranslationServices;

public class TranslationAdapterFactory {
    public static TranslationProviderAdapter getTranslationAdapter(String platform) throws Exception{
        if(platform.equalsIgnoreCase("google")){
            return new GoogleTranslationAdapter();
        } else if(platform.equalsIgnoreCase("microsoft")){
            return new MicrosoftTranslationAdapter();
        }
        throw  new Exception("Unsupported platform");
    }
}
