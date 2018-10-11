package damiano.config;

import damiano.api.IOrder;
import damiano.api.IPizza;
import damiano.implementation.BigPizza;
import damiano.implementation.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public IPizza pizza(){
        return new BigPizza(18, "duza");
    }
//    @Bean
//    public IOrder order(IPizza pizza){
//        return new Order(pizza);
//    }
}
