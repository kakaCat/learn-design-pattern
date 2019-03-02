package learn.app;

import java.util.concurrent.atomic.AtomicInteger;

public class TestMain {
    private static final int COUNT_BITS = Integer.SIZE - 3;
    private static final int RUNNING    = -1 << COUNT_BITS;
    private static final int SHUTDOWN   =  0 << COUNT_BITS;
    private static final int STOP       =  1 << COUNT_BITS;
    private static final int TIDYING    =  2 << COUNT_BITS;
    private static final int TERMINATED =  3 << COUNT_BITS;
    private static final int CAPACITY   = (1 << COUNT_BITS) - 1;

    public static void main(String[] args) {
        System.out.println("RUNNING ->" +RUNNING );
        System.out.println("SHUTDOWN ->" +SHUTDOWN );
        System.out.println("STOP ->" +STOP );
        System.out.println("TIDYING ->" +TIDYING );
        System.out.println("TERMINATED ->" +TERMINATED );
        System.out.println("ctlOf ->" + ctlOf(RUNNING,0));
        System.out.println( 1008|-1);


        System.out.println("CAPACITY ->" + CAPACITY);

        System.out.println("workerCountOf ->" + workerCountOf(ctl.get()));
        System.out.println(1 & CAPACITY);

    }
    private static final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
    private static int ctlOf(int rs, int wc) { return rs | wc; }

    private static int workerCountOf(int c)  { return c & CAPACITY; }

}
