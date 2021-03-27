package com.gai.test;

import com.gai.pojo.Book;
import com.gai.pojo.Page;
import com.gai.service.BookService;
import com.gai.service.impl.BookServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookServiceImplTest {

    private BookService bookService = new BookServiceImpl();

    @Test
    public void addBook() {
        bookService.addBook(new Book(null, "python3.0", "10086", new BigDecimal(1000), 99990, 1000, null));
    }

    @Test
    public void deleteBookById() {
        bookService.deleteBookById(25);
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(24, "python2.0", "10086", new BigDecimal(1000), 99990, 1000, null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(20));
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookService.queryBooks()) {
            System.out.println(queryBook);
        }
    }

    @Test
    public void page() {
        System.out.println(bookService.page(1, Page.PAGE_SIZE));
    }
    @Test
    public void pageByPrice() {
        System.out.println(bookService.pageByPrice(1, Page.PAGE_SIZE,10,50));
    }
}