package learn.model.impl;

import learn.model.IProxy;

/**
 * Created by JAVA on 2018/7/18.
 */
public class ProxyModel implements IProxy {
    @Override
    public void proxyfun() {
        System.out.println("--对象--");
    }
}
