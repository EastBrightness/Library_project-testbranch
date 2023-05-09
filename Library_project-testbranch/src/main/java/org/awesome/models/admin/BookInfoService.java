package org.awesome.models.admin;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.awesome.controllers.admin.BookConfig;
import org.awesome.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookInfoService {

    private BookRepository repository;



}
