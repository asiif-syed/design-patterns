import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private static DBConnection instance;
    private static final Lock lock = new ReentrantLock();
    String url;
    String username;
    private DBConnection(String url, String username)
    {
            this.url = url;
            this.username = username;
    }

    static DBConnection getDBConnection(String url, String username){
        if(instance == null){
            lock.lock();
            if(instance == null){
                instance = new DBConnection(url, username);
            }
            lock.unlock();
        }

        return instance;
    }
}
