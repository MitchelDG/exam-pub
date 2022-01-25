package cz.mkdev.exampub.dto;


import cz.mkdev.exampub.model.UserOrder;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserDetail {

    private Long id;
    private String name;
    private boolean isAdult;
    private Float pocket;
    private List<UserOrder> userOrders;
}
