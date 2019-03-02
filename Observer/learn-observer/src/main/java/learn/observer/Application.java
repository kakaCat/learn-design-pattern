package learn.observer;

import learn.observer.spring.model1.MyApplicationListener;
import learn.observer.spring.model1.Publisher;
import learn.observer.spring.model2.EventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {


    @Bean
    public Publisher publisher() {
        return new Publisher();
    }

    @Bean
    public MyApplicationListener myApplicationListener() {
        return new MyApplicationListener();
    }

    @Autowired
    private Publisher publisher;

    @Autowired
    private EventPublisher service;


    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }




    @RequestMapping("/")
    public void helloConsumer() {
        String msg="Java Code";
        service.doEventWork(msg);
        publisher.publishMyApplicationEvent();
    }


}
