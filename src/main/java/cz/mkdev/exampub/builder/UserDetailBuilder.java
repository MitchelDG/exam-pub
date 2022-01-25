package cz.mkdev.exampub.builder;

import cz.mkdev.exampub.dto.UserDetail;
import cz.mkdev.exampub.dto.UserOrderInfo;
import cz.mkdev.exampub.model.OrderedItems;
import cz.mkdev.exampub.model.User;
import cz.mkdev.exampub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static cz.mkdev.exampub.helper.IsAdultValidator.isAdult;

@RequiredArgsConstructor
@Service
public class UserDetailBuilder {

    private final UserRepository userRepository;

    public UserDetail build(Long id) {
        return showDetail(userRepository.getById(id));
    }

    private UserDetail showDetail(User user) {

        return UserDetail.builder()
                .id(user.getId())
                .name(user.getName())
                .isAdult(isAdult(user))
                .pocket(user.getPocket())
                .userOrders(getUserOrders(user))
                .build();
    }

    private List<UserOrderInfo> getUserOrders(User user) {

        return user.getUserOrderList().stream().map(entity->
            UserOrderInfo.builder()
                    .productNameList(entity.getOrderedItems()
                            .stream()
                            .map(orderedItem -> orderedItem.getDrink().getDrinkName())
                            .collect(Collectors.toList()))
                    .price(entity.getOrderedItems().stream()
                            .mapToDouble(OrderedItems::getTotalPrice)
                            .sum())
                    .build()
        ).collect(Collectors.toList());
    }
}
