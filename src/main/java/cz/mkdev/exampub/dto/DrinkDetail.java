package cz.mkdev.exampub.dto;

import cz.mkdev.exampub.model.OrderedItems;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DrinkDetail {

    private Long id;
    private String drinkName;
    private Float price;
    private boolean isForAdult;
    private List<OrderedItems> orderedItems;
}

