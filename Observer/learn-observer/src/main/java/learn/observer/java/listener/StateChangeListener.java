package learn.observer.java.listener;

import learn.observer.java.Event.MyEvent;

import java.util.EventListener;

public class StateChangeListener implements StateEventListener {

    @Override
    public void handleEvent(MyEvent event) {

        System.out.println("当前事件源状态为：" + event.getSourceState());
    }

    @Override
    public String handleCallBack(MyEvent event){


        return event.getCallBack(event.getCallback());
    }

}
