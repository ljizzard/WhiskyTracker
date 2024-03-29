package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> getWhiskiesByYear(int year);

    List<Whisky> getWhiskiesByDistillaryIdAndAge(Long id, int age);
}
