package learn.observer.spring.model3;

import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class ListenerA implements ApplicationListener<PayloadApplicationEvent<String>> {
    // 由于监听的是String类型的事件会被封装成PayloadApplicationEvent，所以此处类型是PayloadApplicationEvent
    @Override
    public void onApplicationEvent(PayloadApplicationEvent event) {
        // getSource返回真实的事件
        Object msg = event.getSource();
        System.out.println("ListenerA receive:" + msg);
    }
}


