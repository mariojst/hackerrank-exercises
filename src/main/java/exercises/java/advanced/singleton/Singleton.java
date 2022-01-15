package exercises.java.advanced.singleton;

public class Singleton {

    public String str;
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        return instance;
    }

}
