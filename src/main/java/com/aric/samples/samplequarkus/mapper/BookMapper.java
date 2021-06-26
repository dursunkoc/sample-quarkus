package com.aric.samples.samplequarkus.mapper;

import com.aric.samples.samplequarkus.domain.BookDto;
import com.aric.samples.samplequarkus.domain.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface BookMapper {

    BookDto toDto(Book book);

    Book toEntity(BookDto bookDto);
}
