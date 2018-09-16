package learn.pattern.jdk;

import learn.model.IProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by JAVA on 2018/7/18.
 */
public class JdkProxy implements InvocationHandler {

    private IProxy target;

    //绑定委托对象，并返回代理类
    public Object getInstance(IProxy target){
        this.target=target;
        Class clazz=target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;//被代理的类型为Object基类
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        result = method.invoke(target,args);
        //在调用具体函数方法后，执行功能处理
        return result;
    }
}
