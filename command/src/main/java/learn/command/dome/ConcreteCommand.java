package learn.command.dome;

import learn.command.dome.role.Receiver;

public class ConcreteCommand extends Command {
    //接收对象引用
    Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute(){
        receiver.action();
    }


}
