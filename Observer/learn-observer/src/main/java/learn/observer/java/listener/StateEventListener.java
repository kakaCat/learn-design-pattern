package learn.observer.java.listener;

import learn.observer.java.Event.MyEvent;

import java.util.EventListener;

public interface StateEventListener extends EventListener {

    void handleEvent(MyEvent event);


    String handleCallBack(MyEvent event);
}
