package com.assignment.kurrant.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kurrant_rest_controller {
    // 1. 게시물 생성
    @PostMapping("/api/board")
    public void createBoard(String title, String content){

    }
    // 2. 게시물 상세 조회
    @GetMapping("/api/board")
    public String readBoard(){
        return "출발합시다~";
    }
    // 3. 게시물 목록 조회
    @GetMapping("/api/boardList")
    public String readBoardList(){
        return "";
    }
    // 4. 게시물 삭제
    @DeleteMapping("/api/boardRemove")
    public String removeComment(){
        return "";
    }
    // 5. 게시글 검색 (단어)
    @GetMapping("/api/boardSearchWord")
    public String readBoardSearch(){
        return "";
    }
    // 6. 특정기간 게시물 조회
    @GetMapping("/api/boardSearchPeriod")
    public String readBoardDateList(){
        return "";
    }

}
