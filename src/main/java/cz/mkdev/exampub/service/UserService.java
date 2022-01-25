package cz.mkdev.exampub.service;

import cz.mkdev.exampub.builder.UserFacadeBuilder;
import cz.mkdev.exampub.dto.UserFacade;
import cz.mkdev.exampub.model.User;
import cz.mkdev.exampub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserFacadeBuilder userFacadeBuilder;

    public List<UserFacade> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserFacade> temp = new LinkedList<>();
        for(User user: userList) {
            temp.add(userFacadeBuilder.build(user));
        }
        return temp;
    }

//    public boolean validate
}
