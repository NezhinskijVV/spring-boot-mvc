package ru.itsjava.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itsjava.repository.UserRepository;
import ru.itsjava.service.UserService;

@Controller
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/")
    public String getUserList(Model model){
        model.addAttribute("users", userService.findAll());
        return "users-list";
    }
}