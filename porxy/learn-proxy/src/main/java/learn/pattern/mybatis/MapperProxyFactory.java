package learn.pattern.mybatis;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by JAVA on 2018/7/25.
 */
public class MapperProxyFactory<T> {

    private final Class<T> mapperInterface;

    private final Map<Method, String> methodCache = new ConcurrentHashMap();
    public MapperProxyFactory(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    protected T newInstance(MapperProxy<T> mapperProxy) {
        return (T) Proxy.newProxyInstance(this.mapperInterface.getClassLoader(), new Class[]{this.mapperInterface}, mapperProxy);
    }

    public T newInstance() {
        MapperProxy<T> mapperProxy = new MapperProxy( this.mapperInterface, this.methodCache);
        return this.newInstance(mapperProxy);
    }

}
