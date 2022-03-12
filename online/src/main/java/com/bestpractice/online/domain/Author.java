package com.bestpractice.online.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String names;
    @Column(name = "address")
    private String address;
    @ManyToMany(mappedBy = "authors")

    private Set<Book> books;

}
