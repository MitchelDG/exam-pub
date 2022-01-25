package cz.mkdev.exampub.builder;


import cz.mkdev.exampub.dto.UserFacade;
import cz.mkdev.exampub.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static cz.mkdev.exampub.helper.IsAdultValidator.isAdult;

@RequiredArgsConstructor
@Service
public class UserFacadeBuilder {


    public UserFacade build(User user) {
      return UserFacade.builder()
                .id(user.getId())
                .name(user.getName())
                .isActive(user.isActive())
                .isAdult(isAdult(user))
                .pocket(user.getPocket())
                .build();
    }
}
