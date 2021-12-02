package com.project.Cyaegha96.board.rest.repository;

import com.project.Cyaegha96.board.rest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
