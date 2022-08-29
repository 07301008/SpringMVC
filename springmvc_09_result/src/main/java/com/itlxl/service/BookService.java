package com.itlxl.service;

import com.itlxl.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    boolean save(Book book);

    /**
     * 修改
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 根据id查询
     * @param id
     */
    Book getById(Integer id);

    /**
     * 查询所有
     */
    List<Book> getAll();
}
