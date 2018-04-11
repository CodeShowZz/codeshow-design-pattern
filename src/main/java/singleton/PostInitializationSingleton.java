package singleton;

/**
 * This singleton design pattern solve the thread safety problem,post initialize a instance.
 *
 * Using this approach, we rely on the JVM to create the unique instance of the Singleton when the class is loaded. The JVM guarantees that the instance will be created before any thread accesses the static uniqueInstance variable.
 * @author junlin_huang
 * @create 2018-04-11 下午10:09
 **/

public class PostInitializationSingleton {

    private static PostInitializationSingleton uniqueInstance = new PostInitializationSingleton();

    private PostInitializationSingleton() {

    }

    public static PostInitializationSingleton getInstance() {
        return uniqueInstance;
    }
}