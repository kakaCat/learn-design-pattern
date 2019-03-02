package learn.flweight.test;

public class Dome {

    public void test(){
        Thread thread1 = new Thread(
                ()-> {
                    try {
                        wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("run1");

                }
        );
        Thread thread2 = new Thread(
                ()-> System.out.println("run2")
        );


        thread1.start();
        thread2.start();

    }

    public void  run(){
        System.out.println("run");
    }


}
