package com.example.app.controller;

import com.example.app.service.CategoryService;
import com.example.app.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final EventService eventService;

    @GetMapping("/")
    public String getCategoriesAndEventsPage(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        model.addAttribute("events", eventService.findAll());
        return "index";
    }
}