package com.cba.mini_library.service;

import com.cba.mini_library.model.Book;
import com.cba.mini_library.repository.BookRepository;

import java.util.List;

public class BookService {
    BookRepository repository = new BookRepository();
    public List<Book> bookList(){
        return repository.bookList();
    }

    public boolean bookDeleteById(int id){
        repository.bookDeleteById(id);
        return true;
    }
}
