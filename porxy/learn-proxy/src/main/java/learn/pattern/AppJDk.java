package learn.pattern;

import learn.model.IProxy;
import learn.model.impl.ProxyModel;
import learn.pattern.jdk.JdkProxy;

/**
 * Created by JAVA on 2018/7/18.
 */
public class AppJDk {

    public static void main(String[] args) {
        try {
            IProxy proxy = (IProxy) new JdkProxy().getInstance(new ProxyModel());
            proxy.proxyfun();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
