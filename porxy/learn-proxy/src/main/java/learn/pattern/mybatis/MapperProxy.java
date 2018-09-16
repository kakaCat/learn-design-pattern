package learn.pattern.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by JAVA on 2018/7/25.
 */
public class MapperProxy<T> implements InvocationHandler {

    private final Class<T> mapperInterface;

    private final Map<Method, String> methodCache;


    public MapperProxy(Class<T> mapperInterface, Map<Method, String> methodCache) {
        this.mapperInterface = mapperInterface;
        this.methodCache = methodCache;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        try {
//            if(Object.class.equals(method.getDeclaringClass())) {
//                return method.invoke(this, args);
//            }
//
//            if(this.isDefaultMethod(method)) {
//                return this.invokeDefaultMethod(proxy, method, args);
//            }
//        } catch (Throwable var5) {
//
//        }
//
//
//        return mapperMethod.execute(this.sqlSession, args);
        return null;
    }
}
