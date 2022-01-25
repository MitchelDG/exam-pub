package cz.mkdev.exampub.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DrinkFacade {

    private Long id;
    private String drinkName;
    private Float price;
    private boolean isForAdult;

}
