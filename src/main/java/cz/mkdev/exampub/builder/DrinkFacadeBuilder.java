package cz.mkdev.exampub.builder;

import cz.mkdev.exampub.dto.DrinkFacade;
import cz.mkdev.exampub.model.Drink;
import cz.mkdev.exampub.repository.DrinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DrinkFacadeBuilder {

    private final DrinkRepository drinkRepository;


    public DrinkFacade build(Long id) {
        Drink temp = drinkRepository.getById(id);
            return DrinkFacade.builder()
                    .id(temp.getId())
                    .drinkName(temp.getDrinkName())
                    .price(temp.getPrice())
                    .isForAdult(temp.isForAdult())
                    .build();
    }
}
