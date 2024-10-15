package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, CharacterFlyWeight> characters = new HashMap<String, CharacterFlyWeight>();

    public static CharacterFlyWeight getCharacter(char symbol, String name) {
        CharacterFlyWeight requestedChar = characters.get(name);
        // If character doesn't exist, create it and add to the pool
        if (requestedChar == null) {
            requestedChar = new Character(symbol, name);
           characters.put(name, requestedChar);
        }
        return requestedChar;
    }

}
