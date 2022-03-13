package com.bestpractice.online.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinTable(name = "Author_book",joinColumns = @JoinColumn(name = "book_id"),inverseJoinColumns =
    @JoinColumn(name = "author_id"))
    private Set<Author> authors;


}
