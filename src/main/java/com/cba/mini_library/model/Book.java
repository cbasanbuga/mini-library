package com.cba.mini_library.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private int id;

    @NotNull(message = "Title is required")
    private String title;

    @NotNull(message = "Author is required")
    private String author;

    @NotNull(message = "Year is is required")
    private Integer year;

}
