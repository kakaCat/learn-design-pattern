package learn.observer.java.Event;

import learn.observer.java.listener.StateChangeListener;
import learn.observer.java.listener.StateEventListener;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Source {
    private int flag = 0;
    private String callback;

    public Source(){}

    public Source(String callback){
        this.callback = callback;
    }

    Set<EventListener> listeners = new HashSet<EventListener>();
    Set<StateEventListener> stateEventListeners = new HashSet<StateEventListener>();

    public void addStateChangeListener(StateEventListener listener){
        listeners.add(listener);
        stateEventListeners.add(listener);
    }



    public void notifyListener(){
        for (EventListener listener : listeners){
            ((StateChangeListener)listener).handleEvent(new MyEvent(this));
        }
    }

    public List<String> callBacknotifyListener(){
        List<String> str = new ArrayList<String>();

        for (StateEventListener stateEventListener : stateEventListeners) {
            String s = stateEventListener.handleCallBack(new MyEvent(this));
            str.add(s);
        }

        return str;
    }

    public void changeFlag(){
        flag = (flag == 0 ? 1 : 0);
        notifyListener();
    }

    public int getFlag(){
        return flag;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
