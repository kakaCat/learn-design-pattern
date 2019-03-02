package learn.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ExecutorTest {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
             numbers.add(random.nextInt(100000));
         }
        int result = calculate(numbers, 3);
        System.out.println(result);
    }

    public static int calculate(List<Integer> numbers,int digit) {
         List<Callable<Integer>> tasks = new ArrayList<>();
         for (Integer x : numbers) {
                 tasks.add(() -> {
                         int count=0;
                         int y=x;
                         do {
                                 if (y % 10 == digit) {
                                         count++;
                                     }
                                 y /= 10;
                             } while (y > 0);
                          return count;
                    });
             }
        ExecutorService service = Executors.newFixedThreadPool(10);
        int answer=0;
         try {
                 List<Future<Integer>> results = service.invokeAll(tasks);
                  for (Future<Integer> result : results) {
                        try {
                                answer+=result.get();
                            } catch (ExecutionException e) {
                                 e.printStackTrace();
                             }
                      }
             } catch (InterruptedException e) {
                 e.printStackTrace();
            }
        service.shutdown();
        return answer;
    }


}
