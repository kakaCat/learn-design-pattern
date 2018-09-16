package pattern;

import org.junit.Test;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by JAVA on 2018/7/18.
 */
public class demo1 {

    @Test
    public void fun1(){

        ClassLoader loader = this.getClass().getClassLoader();
        InvocationHandler h = new InvocationHandler() {
            /**
             * invoke()方法:
             * 		invoke在调用代理对象所实现的接口中的方法时调用.
             * 		参数:
             * 			1.Object proxy:当前对象,即代理对象.也就是说在调用谁的方法
             * 			2.Method method:当前被调用的方法
             * 			3.Object[] args:方法的实参
             */
            public Object invoke(Object proxy, Method method, Object[] args)
                    throws Throwable {
                System.out.println("执行");
                // TODO Auto-generated method stub
                return null;
            }
        };
        /**
         * 方法作用:动态创建了interface数组中所有指定接口的实现类
         * 		就是说,方法动态生成了一个类,这个类实现了A,B接口,然后创建了这个类
         * 参数:
         * 1.ClassLoader:
         * 需要生成一个类,这个类也需要加载到方法区,谁来加载,当然是ClassLoader
         * 2.Class[] interface:
         * 要实现的接口们
         * 3.InvocationHandler:
         * 它是调用处理器
         */
        Object object = Proxy.newProxyInstance(loader, new Class[]{A.class,B.class}, h);
        /**
         * 代理对象的实现的所有接口中的方法,内容都是调用InvocationHandler的invoke()方法
         */
        A a = (A)object;
        a.a();
        /**
         * a:invoke方法的Object proxy参数
         * aa:invoke方法的Method method参数
         * "hello"和123:invoke方法的Object[] args参数
         * result:对用invoke的return
         */
        Object result = a.aa("hello", 123);  //不执行的
    }
}
interface A {
    public void a();
    /**
     * 		aa:invoke方法的Method method参数
     * @param s    invoke方法的Object[] args参数
     * @param i
     * @return   Object :对用invoke的return
     */
    public Object aa(String s, int i);
}
interface B {
    public void b();
}

//class Aproxy implements A{
//
//
//    @Override
//    public void a() {
//        System.out.println("111111");
//    }
//
//    @Override
//    public Object aa(String s, int i) {
//        System.out.println("22222");
//        return null;
//    }
//}




