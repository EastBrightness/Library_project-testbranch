package org.awesome.controllers.admin;

import org.awesome.entities.User;
import org.awesome.models.admin.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String userList(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "admin/user/index";
    }
}
