package damiano.implementation;

import damiano.api.IOrder;
import damiano.api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(@Qualifier("Big") IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder(){
        System.out.println("Zamowienie: " + pizza.getName() + " " + pizza.getPrice());
    }
}
