package com.example.app.data;

import com.example.app.entity.CategoryEntity;
import com.example.app.entity.EventEntity;
import com.example.app.repository.CategoryRepository;
import com.example.app.repository.EventRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializr {

    private final CategoryRepository categoryRepository;
    private final EventRepository eventRepository;

    @PostConstruct
    public void initializeData() {
        for (int i = 0; i < 6; i++) {
            CategoryEntity categoryEntity = new CategoryEntity("category" + i);
            categoryRepository.save(categoryEntity);

            for (int j = 0; j < 3; j++) {
                EventEntity eventEntity = new EventEntity("event" + i + "-" + j, categoryEntity);
                eventRepository.save(eventEntity);
            }
        }
    }
}
