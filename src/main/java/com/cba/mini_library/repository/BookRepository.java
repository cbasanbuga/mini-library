package com.cba.mini_library.repository;

import com.cba.mini_library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    public static List<Book> bookList = new ArrayList<Book>();
    public static int count = 1;

    public BookRepository() {
        bookList.add(new Book(id(), "Araba Sevdası", "Recaizade Mahmud Ekrem", 1889));
        bookList.add(new Book(id(), "Çalıkuşu", "Reşat Nuri Güntekin", 1922));
        bookList.add(new Book(id(), "Sefiller", "Victor Hugo", 1862));
        bookList.add(new Book(id(), "Suç ve Ceza", "Fyodor Dostoyevski", 1866));
        bookList.add(new Book(id(), "Kürk Mantolu Madonna", "Sabahattin Ali", 1943));
        bookList.add(new Book(id(), "İnce Mehmed", "Yaşar Kemal", 1955));
        bookList.add(new Book(id(), "Beyaz Diş", "Jack London", 1906));
        bookList.add(new Book(id(), "Tutunamayanlar", "Oğuz Atay", 1971));
        bookList.add(new Book(id(), "1984", "George Orwell", 1949));
        bookList.add(new Book(id(), "Hayvan Çiftliği", "George Orwell", 1945));
        bookList.add(new Book(id(), "Saatleri Ayarlama Enstitüsü", "Ahmet Hamdi Tanpınar", 1961));
        bookList.add(new Book(id(), "Don Kişot", "Miguel de Cervantes", 1605));
        bookList.add(new Book(id(), "Beyaz Gemi", "Cengiz Aytmatov", 1970));
        bookList.add(new Book(id(), "Yeraltından Notlar", "Fyodor Dostoyevski", 1864));
        bookList.add(new Book(id(), "Serenad", "Zülfü Livaneli", 2011));
    }

    public int id(){
        return count++;
    }

    public List<Book> bookList(){
        return bookList;
    }

    public boolean bookDeleteById(int id){
        bookList.remove(id-1);
        return true;
    }
}
