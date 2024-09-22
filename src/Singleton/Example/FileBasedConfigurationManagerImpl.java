package Singleton.Example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
    private static FileBasedConfigurationManagerImpl instance;

    private static final Lock lock = new ReentrantLock();

    private FileBasedConfigurationManagerImpl() {

    }

    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = getConfiguration(key);
        if(value == null){
            return null;
        }
        if (type == Integer.class) {
            return type.cast(Integer.parseInt(value));
        } else if (type == Boolean.class) {
            return type.cast(Boolean.parseBoolean(value));
        } else if (type == Double.class) {
            return type.cast(Double.parseDouble(value));
        } else if (type == String.class) {
            return type.cast(value);
        } else {
            throw new IllegalArgumentException("Unsupported type: " + type.getName());
        }
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        if (value instanceof Integer || value instanceof Boolean || value instanceof Double || value instanceof String) {
            properties.setProperty(key, value.toString());
        } else {
            throw new IllegalArgumentException("Unsupported type: " + value.getClass().getName());
        }
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
        return;
    }

    @Override
    public void clear() {
        properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        if (instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new FileBasedConfigurationManagerImpl();
            }
            lock.unlock();
        }
        return instance;
    }

    public static void resetInstance() {
        if (instance != null) {
            instance = null;
        }
    }

}