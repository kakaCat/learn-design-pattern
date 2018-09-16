package learn.builder.app;

import learn.builder.builder.mybatis.SqlssionFactory;
import learn.builder.builder.mybatis.SqlssionFactoryBuilder;

/**
 * Created by JAVA on 2018/7/28.
 */
public class AppMybatis {

    public static void main(String[] args) {

        SqlssionFactory sqlssionFactory = new SqlssionFactoryBuilder(). builder();

        sqlssionFactory.test();

    }

}
