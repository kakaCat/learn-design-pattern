package learn.builder.builder.pattern.impl;

import learn.builder.builder.pattern.Person;
import learn.builder.builder.pattern.PersonBuilder;

/**
 * Created by JAVA on 2018/7/27.
 */
public class ManBuilder implements PersonBuilder {
    Person person;

    public ManBuilder() {
        person = new Person();//创建一个person实例，用于调用set方法
    }

    @Override
    public void buildBody() {
        person.setBody("建造身体部分");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造四肢部分");
    }

    @Override
    public void buildHead() {
        person.setHead("建造头部部分");
    }

    @Override
    public Person buildPerson() {
        return person;//返回一个person实例
    }
}
