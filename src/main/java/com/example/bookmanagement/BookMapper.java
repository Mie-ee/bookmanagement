package com.example.bookmanagement;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("SELECT * FROM books")
    List<Book> findAll();

    @Select("SELECT *FROM books WHERE title LIKE CONCAT( #{prefix}, '%')AND title LIKE CONCAT('%', #{suffix})AND title LIKE CONCAT('%', #{contains}, '%')")
    List<Book> findByTitle(String prefix, String suffix, String contains);

}
