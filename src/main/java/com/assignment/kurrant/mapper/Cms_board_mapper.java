package com.assignment.kurrant.mapper;

import com.assignment.kurrant.model.entity.Cms_board;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Cms_board_mapper {
    void insert(Cms_board board);
}
