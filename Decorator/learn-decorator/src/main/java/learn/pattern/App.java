package learn.pattern;

import learn.model.IBean;
import learn.model.impl.BeanDefault;
import learn.pattern.decorator.BeanEnhance;

/**
 * Created by JAVA on 2018/7/19.
 */
public class App {

    public static void main(String[] args) {

        IBean iBean = new BeanEnhance(new BeanDefault());
        iBean.getBean();

    }


}
