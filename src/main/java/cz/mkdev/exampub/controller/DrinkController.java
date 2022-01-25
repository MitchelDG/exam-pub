package cz.mkdev.exampub.controller;

import cz.mkdev.exampub.dto.DrinkFacade;
import cz.mkdev.exampub.service.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class DrinkController {

    private final DrinkService drinkService;


    @GetMapping(value = "/drink-menu")
    public List<DrinkFacade> getMenu() {
        return drinkService.getMenu();
    }


}
