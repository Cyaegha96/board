package com.project.Cyaegha96.board.rest.controller;

import com.project.Cyaegha96.board.rest.domain.Board;
import com.project.Cyaegha96.board.rest.repository.BoardRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
@RestController
@RequestMapping("/api/board")
public class BoardRestController {

    private BoardRepository boardRepository;

    public BoardRestController(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getBoards(@PageableDefault Pageable pageable){
        Page<Board>  boards = boardRepository.findAll(pageable);
        PagedResources.PageMetadata pageMetadata = new PagedResources.PageMetadata(pageable.getPageSize(), boards.getNumber(), boards.getTotalElements());
        PagedResources<Board> resources = new PagedResources<>(boards.getContent() , pageMetadata);
        resources.add(linkTo(methodOn(BoardRestController.class).getBoards(pageable)).withSelfRel());
        return ResponseEntity.ok(resources);
    }
}
