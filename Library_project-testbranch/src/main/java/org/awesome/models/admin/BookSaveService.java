package org.awesome.models.admin;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.awesome.controllers.admin.BookConfig;
import org.awesome.entities.Book;
import org.awesome.repositories.BookRepository;
import org.awesome.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class BookSaveService {

    @NonNull
    private BookRepository repository;

    public void save(BookConfig book) {
        Book entity = null;

    }

}
