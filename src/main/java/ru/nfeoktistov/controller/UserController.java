package ru.nfeoktistov.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nfeoktistov.entity.User;
import ru.nfeoktistov.entity.request.AddUserRequest;
import ru.nfeoktistov.entity.request.EditUserData;
import ru.nfeoktistov.repository.UserRepository;

import java.util.List;

/**
 * Created by lat-fs on 6/3/2017.
 */

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    private List<User> findAllUsers() {
        return userRepository.findAll();
    }


    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    private User findAllUsersBy(@PathVariable("id") Long id) {
        return userRepository.findOne(id);
    }


    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    private void updateUser(@PathVariable("id") Long id, @RequestBody EditUserData editUserData) {
        User user = new User();
        user.setId(id);
        user.setName(editUserData.getName());
        user.setSurname(editUserData.getSurname());
        userRepository.save(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    private void deleteUsersBy(@PathVariable("id") Long id) {
        userRepository.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody AddUserRequest addUserRequest) {
        User user = new User();
        user.setName(addUserRequest.getName());
        user.setSurname(addUserRequest.getSurname());
        userRepository.save(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Long id) {
        User user = new User();
        userRepository.delete(id);
    }
}
