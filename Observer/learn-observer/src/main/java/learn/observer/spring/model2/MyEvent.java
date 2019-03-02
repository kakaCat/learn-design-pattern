package learn.observer.spring.model2;

import org.springframework.context.ApplicationEvent;

/**
 * 事件源
 */
public class MyEvent extends ApplicationEvent {


    private String msg;

    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
