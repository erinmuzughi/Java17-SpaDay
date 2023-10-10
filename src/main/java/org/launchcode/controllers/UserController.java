package org.launchcode.controllers;

import jakarta.validation.Valid;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.Errors;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm(Model model, @ModelAttribute User user) {
        model.addAttribute("user", new User());
        return "user/add";
    }

    @PostMapping
    public String processAddUserForm(@ModelAttribute @Valid User user, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "user/add";
        }
        else {
            return "user/index";
        }
//            if (user.getPassword().equals(user.getVerify())) {
//                return "user/index";
//            }
//            else {
//                model.addAttribute("error", "Passwords do not match");
//                return "user/add";
//            }

        }
//    }
}
