package com.sms.studentmanagementsystemapi.controller;


import com.sms.studentmanagementsystemapi.exception.UserNotFoundException;
import com.sms.studentmanagementsystemapi.model.User;
import com.sms.studentmanagementsystemapi.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        logger.trace("New student is Added");
        return userRepository.save(newUser);

    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        logger.trace("List of all Students");
        return userRepository.findAll();
    }


    @GetMapping("/user/{id}")
    User getUserByID(@PathVariable Long id){
        return userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException(id));

    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser,@PathVariable Long id){
        logger.trace("Student Details Updated");
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsernames(newUser.getUsernames());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    user.setDegreeProgram(newUser.getDegreeProgram());
                    return userRepository.save(user);
                }).orElseThrow(()->new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        logger.trace("Student Deleted");
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id "+id+" has been deleted successfully.";
    }
}
