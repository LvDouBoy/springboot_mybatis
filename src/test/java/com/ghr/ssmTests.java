package com.ghr;

import com.ghr.domain.Book;
import com.ghr.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ssmTests {

    @Autowired
    BookMapper bookMapper1;

    @Test
    void myTest() {
        Book bookMapper1ById = bookMapper1.getById(1);
        System.out.println(bookMapper1ById);
    }

}
