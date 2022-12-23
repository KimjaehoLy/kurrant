package com.assignment.kurrant.model.entity;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Cms_article {
    private BigInteger article_id;      // 게시글 PK
    private Integer board_id;           // 게시판 FK
    private Timestamp created_datetime; // 생성날짜
    private Boolean is_pinned;          // 게시판 내 고정여부
    private Long view_count;            // (스키마 주석)게시판 내 고정여부? (예상)읽은 횟수?
    private String title;                 // 제목
    private String content_html;        // 본문
    private String content_string;      // 본문 내용만 저장, 검색용이다.
}
