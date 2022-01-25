package cz.mkdev.exampub.builder;


import cz.mkdev.exampub.dto.DrinkDetail;
import cz.mkdev.exampub.model.Drink;
import cz.mkdev.exampub.repository.DrinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DrinkDetailBuilder {

    private final DrinkRepository drinkRepository;


    public DrinkDetail build(Long id) {
        Drink temp = drinkRepository.getById(id);
        return DrinkDetail.builder()
                .id(temp.getId())
                .drinkName(temp.getDrinkName())
                .price(temp.getPrice())
                .isForAdult(temp.isForAdult())
                .orderedItems(temp.getOrderedItems())
                .build();
    }
}
