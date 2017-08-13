package by.intexsoft.SHJ2.controller;

import by.intexsoft.SHJ2.model.User;
import by.intexsoft.SHJ2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/hiber/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")

}
