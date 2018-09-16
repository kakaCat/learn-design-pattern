package learn.pattern.decorator;

import learn.model.IBean;

/**
 * Created by JAVA on 2018/7/19.
 */
public abstract class DecoratorBean implements IBean {

    protected   IBean iBean;

    public DecoratorBean(IBean iBean){
        this.iBean=iBean;
    }

    public abstract void getBean();
}
