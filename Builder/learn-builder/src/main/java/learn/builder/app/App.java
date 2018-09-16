package learn.builder.app;

import learn.builder.builder.pattern.Person;
import learn.builder.builder.pattern.PersonDirector;
import learn.builder.builder.pattern.impl.ManBuilder;

/**
 * Created by JAVA on 2018/7/27.
 */
public class App {


    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }

}
