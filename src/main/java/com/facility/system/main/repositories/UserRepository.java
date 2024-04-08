package com.facility.system.main.repositories;

import com.facility.system.main.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
