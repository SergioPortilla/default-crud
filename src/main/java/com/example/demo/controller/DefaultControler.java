package com.example.demo.controller;

import com.example.demo.models.DefaultThing;
import com.example.demo.service.IDefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class DefaultControler {

    @Autowired
    private IDefaultService defaultService;

    @GetMapping("/listar")
    public @ResponseBody Iterable<DefaultThing> listar(Model model) {
        return  defaultService.findAll();
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
//
//        User n = new User();
//        n.setName(name);
//        n.setEmail(email);
//        userRepository.save(n);
        return "Saved";
    }

}