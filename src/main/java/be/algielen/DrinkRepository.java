package be.algielen;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class DrinkRepository {
    public static final Map<Long, Drink> drinks = new HashMap<>();

    @PostConstruct
    public void init() {
        Drink coca = new Drink();
        coca.setName("Coca Cola");
        coca.setId(0L);
        coca.setType(DrinkType.SODA);
        coca.setVolume(0.33d);
        coca.setCalories(43);
    }
}
