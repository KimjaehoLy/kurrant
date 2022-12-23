package com.assignment.kurrant.model.vo;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Cms_article_vo {
    private BigInteger article_id;      // 게시글 PK
    private Integer board_id;           // 게시판 FK
    private Timestamp created_datetime; // 생성날짜
    private Boolean is_pinned;          // 게시판 내 고정여부
    private Long view_count;            // (스키마 주석)게시판 내 고정여부? (예상)읽은 횟수?
    private String title;                 // 제목
    private String content_html;        // 본문
    private String content_string;      // 본문 내용만 저장, 검색용이다.

    public BigInteger getArticle_id() {
        return article_id;
    }

    public Integer getBoard_id() {
        return board_id;
    }

    public Timestamp getCreated_datetime() {
        return created_datetime;
    }

    public Boolean getIs_pinned() {
        return is_pinned;
    }

    public Long getView_count() {
        return view_count;
    }

    public String getTitle() {
        return title;
    }

    public String getContent_html() {
        return content_html;
    }

    public String getContent_string() {
        return content_string;
    }
}
