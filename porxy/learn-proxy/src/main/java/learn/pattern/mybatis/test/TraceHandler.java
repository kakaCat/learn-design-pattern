package learn.pattern.mybatis.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by JAVA on 2018/7/26.
 */
public class TraceHandler implements InvocationHandler {
//    @Autowired
//    private Calculate calculate;

    /**
     * Constructs a TraceHandler
     */
    public TraceHandler() {

    }
    @Override
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        return Integer.parseInt(args[0].toString()) + Integer.parseInt(args[1].toString());
    }
}
