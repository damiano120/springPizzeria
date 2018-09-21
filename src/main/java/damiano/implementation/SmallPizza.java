package damiano.implementation;

import damiano.api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Small")
public class SmallPizza implements IPizza {

    private int price;
    private String name;

    public SmallPizza(@Value("10") int price, @Value("Small pizza") String name) {
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
