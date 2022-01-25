package cz.mkdev.exampub.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserFacade {

    private Long id;
    private String name;
    private boolean isActive;
    private boolean isAdult;
    private Float pocket;


}
