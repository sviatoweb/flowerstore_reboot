package ua.edu.ucu.apps.lab71.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("list")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
}
