package learn.observer;

import learn.observer.spring.model3.ListenerA;
import learn.observer.spring.model3.SaySomethingPublisher;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationEventDome {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //添加启动
        context.addApplicationListener(new MyApplicationListener());
        context.addApplicationListener(new ListenerA());

        //启动上下文
        context.refresh();
        //
        context.publishEvent(new MyApplicationEvent("Hello world"));
        context.publishEvent();
    }

    private static class MyApplicationListener implements ApplicationListener<MyApplicationEvent>{

        @Override
        public void onApplicationEvent(MyApplicationEvent event) {
            System.out.printf("MyApplicationListener receives event source : %s \n", event.getSource());
        }
    }


    private static class MyApplicationEvent extends ApplicationEvent {

        public MyApplicationEvent(Object source) {
            super(source);
        }
    }


}
