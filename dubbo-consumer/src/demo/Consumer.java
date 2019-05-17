package demo;

import com.demo.helloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main (String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/dubbo-provider.xml");
        context.start();
        helloService helloServices = (helloService)context.getBean("helloService"); // 获取远程服务代理
        String hello = helloServices.sayHelo("world"); // 执行远程方法
        System.out.println(hello);
    }
}
