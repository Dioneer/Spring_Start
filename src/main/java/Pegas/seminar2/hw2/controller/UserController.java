package Pegas.seminar2.hw2.controller;

import Pegas.seminar2.hw2.DTO.UserCreateUpdateDTO;
import Pegas.seminar2.hw2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public String findAll(Model model){
        model.addAttribute("users", userService.findAll());
        return "user/users";
    }
    @GetMapping("/users/create")
    public String getCreate(Model model){
        return "user/create";
    }

    @GetMapping("/users/{id}")
    public String findById(@PathVariable("id") Integer id,  Model model){
        return userService.findById(id)
                .map(i-> {
                    model.addAttribute("user", i);
                    return "user/user";
                }).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/users")
    public String create(@ModelAttribute UserCreateUpdateDTO user){
        userService.create(user);
        return "redirect:/users/"+3;
    }

    @GetMapping("/user-update/{id}")
    public String getUpd(@PathVariable("id") Integer id,  Model model){
        return userService.findById(id)
                .map(i-> {
                    model.addAttribute("user", i);
                    return "user/user";
                }).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/users/{id}/update")
    public String update(@PathVariable("id") Integer id, @ModelAttribute UserCreateUpdateDTO user){
        userService.update(id, user);
        return "redirect:/users/{id}";
    }

    @PostMapping("/users/{id}/delete")
    public String delete(@PathVariable("id") Integer id){
        userService.delete(id);
        return "redirect:/users";
    }

}
