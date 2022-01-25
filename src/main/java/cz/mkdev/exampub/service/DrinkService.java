package cz.mkdev.exampub.service;

import cz.mkdev.exampub.builder.DrinkFacadeBuilder;
import cz.mkdev.exampub.dto.DrinkFacade;
import cz.mkdev.exampub.model.Drink;
import cz.mkdev.exampub.repository.DrinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DrinkService {

    private final DrinkRepository drinkRepository;
    private final DrinkFacadeBuilder drinkFacadeBuilder;

    public List<DrinkFacade> getMenu() {
        List<Drink> drinkList = drinkRepository.findAll();
        List<DrinkFacade> temp = new LinkedList<>();
        for(Drink drink: drinkList) {
            temp.add(drinkFacadeBuilder.build(drink.getId()));
        }
        return temp;
    }
}
