package damiano.implementation;

import damiano.api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Big")
public class BigPizza implements IPizza {

    private int price;
    private String name;

    public BigPizza(
            @Value("20") int price,
            @Value("big") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
