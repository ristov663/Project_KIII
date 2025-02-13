package com.example.app.service;

import com.example.app.entity.EventEntity;
import com.example.app.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public List<EventEntity> findAll() {
        return eventRepository.findAll();
    }
}
