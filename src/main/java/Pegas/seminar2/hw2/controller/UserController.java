package Pegas.seminar2.hw2.controller;

import Pegas.seminar2.hw2.DTO.UserCreateUpdateDTO;
import Pegas.seminar2.hw2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("users", userService.findAll());
        return "user/users";
    }

    @GetMapping("/id")
    public String findById(@PathVariable("id") Integer id,  Model model){
        model.addAttribute("user", userService.findById(id));
        return "user/user";
    }

    @PostMapping
    public String create(@ModelAttribute UserCreateUpdateDTO user){
        userService.create(user);
        return "redirect:/users/"+2;
    }

    @PostMapping("/{id}/update")
    public String update(@PathVariable("id") Integer id, @ModelAttribute UserCreateUpdateDTO user){
        userService.update(id, user);
        return "redirect:/users/{id}";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") Integer id){
        userService.delete(id);
        return "redirect:/users";
    }

}
