package learn.app;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableTest {

    public static void main(String[] args) {
        Callable<Integer> callableimpl = new Callableimpl();

        Future<Integer> result  = new FutureTask<Integer>(callableimpl);

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }

}

class Callableimpl implements Callable<Integer>{

    int count = 100;

    @Override
    public Integer call() throws Exception {
        int sum =0;
        for(int i = 0; i< count;i++){
            System.out.println(sum += i);
        }


        return sum;
    }
}
