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
public class UserOrderFacade {

    private Long id;
    private Long userId;
    private List<UserOrderInfo> orderedItemsFacades;
}
