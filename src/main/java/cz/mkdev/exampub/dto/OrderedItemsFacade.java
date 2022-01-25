package cz.mkdev.exampub.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderedItemsFacade {

    private Long id;
    private Long userId;
    private Long drinkId;
    private Float totalPrice;
}
