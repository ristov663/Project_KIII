package com.example.app.controller;

import com.example.app.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping("/events")
    public String getEventsPage(Model model) {
        model.addAttribute("events", eventService.findAll());
        return "events";
    }
}
