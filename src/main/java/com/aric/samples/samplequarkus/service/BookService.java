package com.aric.samples.samplequarkus.service;

import com.aric.samples.samplequarkus.domain.BookDto;
import com.aric.samples.samplequarkus.domain.entity.Book;
import com.aric.samples.samplequarkus.mapper.BookMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class BookService {
    @Inject
    private BookRepository bookRepository;

    @Inject
    private BookMapper bookMapper;

    public List<BookDto> listBooks() {
        List<Book> books = bookRepository.listAll();
        return books.stream().map(bookMapper::toDto).collect(Collectors.toList());
    }

    @Transactional
    public BookDto newBook(BookDto bookDto) {
        Book book = bookMapper.toEntity(bookDto);
        bookRepository.persist(book);
        return bookMapper.toDto(book);
    }
}
