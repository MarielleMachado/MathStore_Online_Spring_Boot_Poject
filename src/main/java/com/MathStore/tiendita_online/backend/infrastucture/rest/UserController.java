package com.MathStore.tiendita_online.backend.infrastucture.rest;


import com.MathStore.tiendita_online.backend.application.UserService;
import com.MathStore.tiendita_online.backend.domain.model.User;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

@RestController
//http://localhost:8085
@RequestMapping("/api/v1/users")
//http://localhost:8085/api/v1/users
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User Save( @RequestBody User user){
        return userService.save(user);
    }

    //http://localhost:8085/api/v1/users/4
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return  userService.findById(id);
    }
}
