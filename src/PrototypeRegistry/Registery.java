package PrototypeRegistry;

import java.util.HashMap;

public class Registery {
    private HashMap<String, Student> register;

    public Registery(){
        register = new HashMap<>();
    }
    public void put(String key, Student s){
        register.put(key, s);
    }

    public  Student get(String key){
        return register.get(key).clone();
    }
}
