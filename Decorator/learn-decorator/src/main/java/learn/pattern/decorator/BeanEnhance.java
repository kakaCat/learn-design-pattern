package learn.pattern.decorator;

import learn.model.IBean;

/**
 * Created by JAVA on 2018/7/19.
 */
public class BeanEnhance extends DecoratorBean {

    public BeanEnhance(IBean iBean) {
        super(iBean);
    }

    @Override
    public void getBean() {
        super.iBean.getBean();
        System.out.println("--增强--");
    }


}
