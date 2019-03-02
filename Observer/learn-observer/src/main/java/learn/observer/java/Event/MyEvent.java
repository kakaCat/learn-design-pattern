package learn.observer.java.Event;

import learn.observer.java.Event.Source;

import java.util.EventObject;

public class MyEvent extends EventObject {
    private int sourceState;

    private String callback;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MyEvent(Object source) {
        super(source);
        this.sourceState = ((Source)source).getFlag();
        this.callback = ((Source) source).getCallback();
    }

    public int getSourceState() {
        return sourceState;
    }



    public String getCallBack(String str){
        return str;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
