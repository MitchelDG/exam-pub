package cz.mkdev.exampub.builder;

import cz.mkdev.exampub.dto.UserDetail;
import cz.mkdev.exampub.model.User;
import cz.mkdev.exampub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static cz.mkdev.exampub.helper.IsAdultValidator.isAdult;

@RequiredArgsConstructor
@Service
public class UserDetailBuilder {

    private UserRepository userRepository;

    public UserDetail build(Long id) {
        return showDetail(userRepository.getById(id));
    }

    private UserDetail showDetail(User user) {
        return UserDetail.builder()
                .id(user.getId())
                .name(user.getName())
                .isAdult(isAdult(user))
                .pocket(user.getPocket())
                .userOrders(user.getUserOrderList())
                .build();
    }
}
