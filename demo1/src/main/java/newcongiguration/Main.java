package newcongiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String [] arg){
        ApplicationContext context = new AnnotationConfigApplicationContext(Myconfiguration.class);
        Address ad = context.getBean(Address.class);
        System.out.println(ad.toString());
    }

}
