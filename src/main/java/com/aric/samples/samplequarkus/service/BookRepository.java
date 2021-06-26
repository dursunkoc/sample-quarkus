package com.aric.samples.samplequarkus.service;

import com.aric.samples.samplequarkus.domain.entity.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookRepository implements PanacheRepository <Book>{

}
