package com.dreamtown.meliatownhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.meliatownhouse.entity.ContactPerson;

public interface ContactPersonRepository extends JpaRepository<ContactPerson, Integer>{
    
}
