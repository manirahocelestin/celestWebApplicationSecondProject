package com.bestpractice.online.domain;

import javax.persistence.*;
import javax.websocket.ClientEndpoint;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "bland")
    private String bland;
    @Column(name = "plack")
    private String plack;
}
