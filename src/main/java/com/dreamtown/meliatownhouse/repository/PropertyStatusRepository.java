package com.dreamtown.meliatownhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.meliatownhouse.entity.PropertyStatus;

public interface PropertyStatusRepository extends JpaRepository<PropertyStatus, Integer>{
    
}
