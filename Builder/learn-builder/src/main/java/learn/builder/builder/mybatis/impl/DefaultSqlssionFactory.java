package learn.builder.builder.mybatis.impl;

import learn.builder.builder.mybatis.SqlssionFactory;

/**
 * Created by JAVA on 2018/7/28.
 */
public class DefaultSqlssionFactory implements SqlssionFactory{


    @Override
    public void test() {
        System.out.println("创建 Sqlssion");
    }
}
