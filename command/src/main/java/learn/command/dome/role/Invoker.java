package learn.command.dome.role;

import learn.command.dome.Command;

public class Invoker {

    Command command ;
    public Invoker(Command c) {
        // TODO Auto-generated constructor stub
        this.command = c ;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doSomething(){
        command.execute();//业务实现方法，调用命令类的execute()方法
    }


}
