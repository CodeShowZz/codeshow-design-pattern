package singleton;

/**
 * On one hand,the {@code LazyInitializationSingleton} will solve the problem about multithreading safety .On the other hand,use “double-checked locking” to reduce the use of
 * synchronization in getInstance().
 *
 * @author junlin_huang
 * @create 2018-04-11 下午9:51
 **/

public class LazyInitializationSingleton {

    private volatile static LazyInitializationSingleton uniqueInstance;

    private LazyInitializationSingleton() {

    }

    public static synchronized LazyInitializationSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (LazyInitializationSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new LazyInitializationSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
