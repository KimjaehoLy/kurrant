package com.assignment.kurrant.mapper;

import com.assignment.kurrant.model.entity.Cms_article;
import com.assignment.kurrant.model.entity.Cms_board;
import com.assignment.kurrant.model.vo.Cms_article_vo;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface Cms_article_mapper {
    void insert(String title, String content);
    void delete(BigInteger id);
    List<Cms_article_vo> select(Cms_article board);
}
