package learn.SimpleClassLoader;

/**
 * Created by JAVA on 2018/7/18.
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        SimpleClassLoader simpleClassLoader = new SimpleClassLoader();
        Class<?> aClass = simpleClassLoader.loadClass("JDK.Array.Man1");
        System.out.println(aClass);
    }

}
