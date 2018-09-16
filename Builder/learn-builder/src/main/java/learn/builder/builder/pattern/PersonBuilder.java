package learn.builder.builder.pattern;

/**
 * Created by JAVA on 2018/7/27.
 */
public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();//组装

}
