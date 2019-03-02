package learn.command.dome;

import learn.command.dome.role.Invoker;
import learn.command.dome.role.Receiver;

public class Test {

    public static void main(String[] args) {
        //执行者
        Receiver receiver = new Receiver();
        //执行
        Command cmd = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(cmd);

        invoker.doSomething();
    }

}
