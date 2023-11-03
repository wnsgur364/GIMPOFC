package com.orange.board.service;

import org.springframework.stereotype.Service;
import com.orange.board.dto.BoardDTO;
import com.orange.board.entity.BoardEntity;
import com.orange.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;

// DTO -> Entity (Entity Class)
// Entity -> DTO (DTO Class)

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
