package com.ngt.ioc;

import com.ngt.ioc.bean.Book;

/**
 * 2023-07-29 17:46
 * @author 696292
 */
public class _02_DependencyInjection {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("C++");
        book.setAuthor("xxx");
        book.setPrice(99.9);
        System.out.println(book);
    }



}
