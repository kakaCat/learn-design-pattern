package learn.observer.spring.model2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 *  注册事件
 */
@Component
public class EventPublisher implements ApplicationEventPublisherAware {

    /** logger */
    private static final Logger logger = LoggerFactory.getLogger(EventPublisher.class);

    public ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public String doEventWork(String msg) {
        System.out.println("------------publish event:" + msg);

        MyEvent event = new MyEvent(this, msg);
        publisher.publishEvent(event);
        return "OK";
    }


}
