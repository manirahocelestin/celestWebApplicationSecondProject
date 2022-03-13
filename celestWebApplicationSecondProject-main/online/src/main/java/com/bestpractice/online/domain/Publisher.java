package com.bestpractice.online.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String names;
    @Column(name = "address")
    private String address;
    @OneToMany
    @JoinColumn(name = "pub_book")
    private Set<Book> books;
}
