package learn.model.impl;

import learn.model.IBean;

/**
 * Created by JAVA on 2018/7/19.
 */
public class BeanDefault implements IBean {
    @Override
    public void getBean() {
        System.out.println("--bean--");
    }
}
