package com.dreamtown.meliatownhouse.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dreamtown.meliatownhouse.entity.Role;
import com.dreamtown.meliatownhouse.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Page<User> findByRoleNot(Role role, Pageable pageable);
}
