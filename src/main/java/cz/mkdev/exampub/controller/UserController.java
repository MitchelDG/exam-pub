package cz.mkdev.exampub.controller;

import cz.mkdev.exampub.builder.UserDetailBuilder;
import cz.mkdev.exampub.dto.UserDetail;
import cz.mkdev.exampub.dto.UserFacade;
import cz.mkdev.exampub.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/users")
public class UserController {

    private final UserService userService;
    private final UserDetailBuilder userDetailBuilder;



    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserFacade> getAllUsers() {
        return userService.getAllUsers();
    }


    @GetMapping(value = "/{id}")
    public UserDetail getUser(@PathVariable Long id) {
        return userDetailBuilder.build(id);
    }

}
