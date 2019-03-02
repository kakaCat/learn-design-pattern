package learn.flweight.param;

import learn.flweight.param1.Flyweight;
import learn.flweight.test.Dome;
import org.junit.Test;

public class FlyweightFactoryTest {


    @Test
    public void Client(){
        // TODO Auto-generated method stub
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");

        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");

    }

    @Test
    public void thread() {
        Dome dome = new Dome();
        Thread thread = new Thread(
                () -> dome.test()
        );
        thread.start();

        System.out.println("完成");

    }

}