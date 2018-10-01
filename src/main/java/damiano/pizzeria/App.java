package damiano.pizzeria;

import damiano.api.IOrder;
import damiano.config.AutoConfig;
import damiano.config.Config;
import damiano.implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = context.getBean(Order.class);
        order.printOrder();
        I
    }
}
