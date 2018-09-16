package learn.pattern;

import learn.model.IProxy;
import learn.model.impl.ProxyModel;
import learn.pattern.PxoryFactory.ProxyFactory;
import learn.pattern.PxoryFactory.advice.AfterAdvice;
import learn.pattern.PxoryFactory.advice.BeforeAdvice;

/**
 * Created by JAVA on 2018/7/18.
 */
public class AppFactory {


    public static void main(String[] args) {

        ProxyFactory factory = new ProxyFactory();//创建工厂
        factory.setTargetObject(new ProxyModel());
        factory.setBeforeAdvice(new BeforeAdvice() {
            @Override
            public void before() {
                System.out.println("--前--");
            }
        });
        factory.setAfterAdvice(new AfterAdvice() {
            @Override
            public void after() {
                System.out.println("--后--");
            }
        });
        IProxy target = (IProxy)factory.createProxy();
        target.proxyfun();

    }

}
