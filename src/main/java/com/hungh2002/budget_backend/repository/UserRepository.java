package com.hungh2002.budget_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hungh2002.budget_backend.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
