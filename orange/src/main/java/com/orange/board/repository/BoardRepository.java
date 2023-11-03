package com.orange.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.orange.board.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
