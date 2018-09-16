package learn.pattern.PxoryFactory;

import learn.pattern.PxoryFactory.advice.AfterAdvice;
import learn.pattern.PxoryFactory.advice.BeforeAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by JAVA on 2018/7/18.
 */
public class ProxyFactory {

    private Object targetObject;//目标对象

    private BeforeAdvice beforeAdvice;//前置增强

    private AfterAdvice afterAdvice;//后置增强

    /**
     * 用来生成代理对象
     * @return
     */

    public Object createProxy() {

        /*
         * 1. 给出三大参数
         */

        ClassLoader loader = this.getClass().getClassLoader();

        Class[] interfaces = targetObject.getClass().getInterfaces();

        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                 /*
                 * 在调用代理对象的方法时会执行这里的内容
                 */
                // 执行前置增强
                if(beforeAdvice != null) {

                    beforeAdvice.before();
                }
                Object result = method.invoke(targetObject, args);//执行目标对象的目标方法
                // 执行后置增强
                if(afterAdvice != null) {

                    afterAdvice.after();

                }
                // 返回目标对象的返回值

                return result;

            }
        };

        Object proxyObject = Proxy.newProxyInstance(loader, interfaces, h);

        return proxyObject;
    }

    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    public BeforeAdvice getBeforeAdvice() {
        return beforeAdvice;
    }

    public void setBeforeAdvice(BeforeAdvice beforeAdvice) {
        this.beforeAdvice = beforeAdvice;
    }

    public AfterAdvice getAfterAdvice() {
        return afterAdvice;
    }

    public void setAfterAdvice(AfterAdvice afterAdvice) {
        this.afterAdvice = afterAdvice;
    }
}
