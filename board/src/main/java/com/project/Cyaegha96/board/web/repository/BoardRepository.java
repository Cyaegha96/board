package com.project.Cyaegha96.board.web.repository;

import com.project.Cyaegha96.board.web.domain.Board;
import com.project.Cyaegha96.board.web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository  extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
