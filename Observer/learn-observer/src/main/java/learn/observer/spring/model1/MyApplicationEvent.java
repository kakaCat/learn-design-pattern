package learn.observer.spring.model1;

import org.springframework.context.ApplicationEvent;

public class MyApplicationEvent  extends ApplicationEvent {

    public MyApplicationEvent(Object source){super(source);}

}
