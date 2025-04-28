package com.cba.mini_library.controller;

import com.cba.mini_library.model.Book;
import com.cba.mini_library.repository.BookRepository;
import com.cba.mini_library.service.BookService;
import jakarta.validation.Valid;
import org.springframework.boot.Banner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    public BookService bookService = new BookService();


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("lists", bookService.bookList());
        return "index";
    }

    @GetMapping("/book-delete/{id}")
    public String bookDelete(@PathVariable("id") int id, Model model){
        System.out.println(BookRepository.bookList.get(id).getTitle());
        System.out.println(id);
        boolean result = bookService.bookDeleteById(id);

        if (result){
            return "redirect:/";
        }else {
            return "error";
        }
    }

    @GetMapping("/book-add")
    public String bookAdd(Model model){
        model.addAttribute("book", new Book());
        return "book-add";
    }

    @PostMapping("/book-add")
    public String bookAddProcess(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return "book-add";
        else
            return "redirect:/";
    }

}
