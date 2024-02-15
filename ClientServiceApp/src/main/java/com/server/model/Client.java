package com.server.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
public class Client {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    @NotBlank
    @Size(min=2, max=50)
    private String name;

    @Column(nullable = true)
    private String email;

    @Column(nullable = true)
    @Size(min=6, max=12)
    private String phone;


    @Enumerated(EnumType.STRING)
    private Gender gender;


    public Client() {
    }
}