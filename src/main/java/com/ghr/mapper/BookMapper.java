package com.ghr.mapper;

import com.ghr.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper

public interface BookMapper {

    @Select("select * from tbl_book where id= #{id}")
    public Book getById(int id);

}
