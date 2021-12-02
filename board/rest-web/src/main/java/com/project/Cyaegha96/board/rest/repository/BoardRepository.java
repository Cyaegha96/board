package com.project.Cyaegha96.board.rest.repository;

import com.project.Cyaegha96.board.rest.domain.Board;
import com.project.Cyaegha96.board.rest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository  extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
