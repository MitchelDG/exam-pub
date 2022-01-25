package cz.mkdev.exampub.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserOrderInfo {
    private List<String> productNameList;
    private Integer amount;
    private Double price;

}
