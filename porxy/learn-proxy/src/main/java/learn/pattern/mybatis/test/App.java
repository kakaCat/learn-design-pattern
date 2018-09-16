package learn.pattern.mybatis.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by JAVA on 2018/7/26.
 */
public class App {



    public static void main(String[] args) {
        InvocationHandler handler = new TraceHandler();
        FacadeCalculate proxy = (FacadeCalculate) Proxy.newProxyInstance(FacadeCalculate.class.getClassLoader(),
                new Class[] { FacadeCalculate.class }, handler);

        Integer result= proxy.add(2,3);
        System.out.println(result);
    }

}
