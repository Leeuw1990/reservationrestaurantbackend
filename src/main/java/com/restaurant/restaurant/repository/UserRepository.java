package com.restaurant.restaurant.repository;

import com.restaurant.restaurant.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
