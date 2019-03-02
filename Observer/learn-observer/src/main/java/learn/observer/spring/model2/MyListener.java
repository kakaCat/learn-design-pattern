package learn.observer.spring.model2;

import org.springframework.context.ApplicationListener;

public class MyListener implements ApplicationListener<MyEvent>{

    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.print("监听到MyEvent事件");
    }

}
