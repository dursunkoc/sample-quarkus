package com.aric.samples.samplequarkus.controller;

import com.aric.samples.samplequarkus.domain.BookDto;
import com.aric.samples.samplequarkus.service.BookService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("book")
public class BookController {
    @Inject
    private BookService bookService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BookDto> listBooks(){
        return bookService.listBooks();
    }


    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public BookDto newBook(BookDto bookDto){
        return bookService.newBook(bookDto);
    }
}
