package com.example.app.data;

import com.example.app.entity.CategoryEntity;
import com.example.app.repository.CategoryRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializr {

    private final CategoryRepository categoryRepository;

    @PostConstruct
    public void initializeData() {
        for (int i = 0; i < 5; i++) {
            CategoryEntity categoryEntity = new CategoryEntity("category" + i);
            categoryRepository.save(categoryEntity);
        }
    }
}
