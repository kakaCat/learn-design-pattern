package learn.pattern;

import learn.model.IProxy;
import learn.pattern.mybatis.MapperProxyFactory;

/**
 * Created by JAVA on 2018/7/25.
 */
public class AppMybatis {

    public static void main(String[] args) {
        MapperProxyFactory<IProxy> factory = new MapperProxyFactory<>(IProxy.class);



    }

}
