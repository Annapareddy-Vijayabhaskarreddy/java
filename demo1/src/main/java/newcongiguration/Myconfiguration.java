package newcongiguration;

import org.springframework.context.annotation.Bean;

public class Myconfiguration {
    @Bean(name ="address")
    public Address addr()
    {
        return new Address(10,"GandhiStreet","Chennai",600024);
    }

}
