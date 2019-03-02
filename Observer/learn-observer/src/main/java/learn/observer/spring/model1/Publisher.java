package learn.observer.spring.model1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Publisher implements ApplicationContextAware {

    private ApplicationContext appCtx=null;

    @Override
    public void setApplicationContext(ApplicationContext appCtx) throws BeansException {
        this.appCtx=appCtx;
    }
    public void publishMyApplicationEvent(){
        /*以String 对象作为事件源*/
        String strSource=new String("我是事件源");
        /*这就是要实现ApplicationContextAware 接口的原因，因为需要当前应用的ApplicationContext 对象*/
        MyApplicationEvent event=new MyApplicationEvent(strSource);
        /*使用ApplicationContext 对象的publishEvent 方法发布事件*/
        this.appCtx.publishEvent(event);
    }



}
