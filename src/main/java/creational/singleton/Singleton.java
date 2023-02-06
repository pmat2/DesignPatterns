package creational.singleton;

public class Singleton {
    private static volatile Singleton instance;             // fix for returning partially constructed object from multiple threads
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        if (instance == null) {                             // double-checked locking idiom
            synchronized (Singleton.class) {                // prevention from multiple threads executing this code simultaneously
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }
}
