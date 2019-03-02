package learn.observer.spring.model2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 执行
 */
@Component
public class MyEventHandler {

    @EventListener
    public void handleEvent(MyEvent event) {
        System.out.println("------------处理事件：{}"+ event.getMsg());
        try {
            Thread.sleep(5 * 1000L);
            System.out.println("事件1(5s)处理完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
