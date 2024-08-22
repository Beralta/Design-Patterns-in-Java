package design_patterns_in_java.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(Singleton.getInstance());

    }
}
