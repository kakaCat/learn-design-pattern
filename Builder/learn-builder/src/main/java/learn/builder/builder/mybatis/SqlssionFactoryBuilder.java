package learn.builder.builder.mybatis;

import learn.builder.builder.mybatis.impl.DefaultSqlssionFactory;

/**
 * Created by JAVA on 2018/7/28.
 */
public class SqlssionFactoryBuilder {

    public SqlssionFactory builder(){
        SqlssionFactory sqlssionFactory = new DefaultSqlssionFactory();

        return sqlssionFactory;
    }


}
