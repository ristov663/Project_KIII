package com.example.app.controller;

import com.example.app.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/")
    public String getUsersPage(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "index";
    }
}
