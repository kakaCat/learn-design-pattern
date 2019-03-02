package learn.observer.java.test;

import learn.observer.java.Event.Source;
import learn.observer.java.listener.StateChangeListener;

import java.util.List;

public class Test {


    public static void main(String[] args){

        Source source = new Source("111");
        source.addStateChangeListener(new StateChangeListener());
        source.changeFlag();

        List<String> strings = source.callBacknotifyListener();
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
