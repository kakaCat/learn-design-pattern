package learn.observer.spring.model1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent e){	//ApplicationEvent的事件处理句柄为onApplicationEvent
        if(e instanceof MyApplicationEvent){
            System.out.println("收到了MyApplicationEvent 事件，事件源为："+e.getSource());
        }
    }


}
