package cn.jcorn.dubbo.consumer;

import cn.jcorn.dubbo.api.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/consumer.xml"});
        context.start();
        GreetingService greetingService = (GreetingService) context.getBean("dubboService");
        String hello = greetingService.sayHello("world");
        System.out.println(hello);
    }
}
