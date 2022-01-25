package cz.mkdev.exampub.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetail {

    private Long id;
    private String name;
    private boolean isAdult;
    private Float pocket;
    private List<UserOrderInfo> userOrders;
}
