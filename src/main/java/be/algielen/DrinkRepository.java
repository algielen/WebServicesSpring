package be.algielen;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DrinkRepository {

    private static final Map<Long, Drink> drinks = new HashMap<>();

    @PostConstruct
    public void init() {
        Drink coca = new Drink();
        coca.setName("Coca Cola");
        coca.setUniqueName("coca_33");
        coca.setId(0L);
        coca.setType(DrinkType.SODA);
        coca.setVolume(0.33d);
        coca.setCalories(43);

        Drink spa = new Drink();
        spa.setName("Spa Reine");
        spa.setUniqueName("spa_1");
        spa.setId(1L);
        spa.setType(DrinkType.WATER);
        spa.setVolume(1d);
        spa.setCalories(0d);

        Drink tea = new Drink();
        tea.setName("Earl Grey");
        tea.setUniqueName("earl_grey_20");
        tea.setId(2L);
        tea.setType(DrinkType.INFUSION);
        tea.setVolume(0.20d);
        tea.setCalories(0.1d);

        Stream.of(coca, spa, tea).forEach(drink -> drinks.put(drink.getId(), drink));
    }

    Drink findDrink(String uniqueName) {
        return drinks.values().stream()
            .filter(drink -> drink.getUniqueName().equals(uniqueName))
            .findFirst().orElse(null);
    }
}
