package creational.singleton;

public class Singleton {
    private static volatile Singleton instance;             // fix for returning partially constructed object from multiple threads
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;                        // storing instance locally to avoid storing it in main memory
        if (result == null) {                               // double-checked locking idiom
            synchronized (Singleton.class) {                // prevention from multiple threads executing this code simultaneously
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}
