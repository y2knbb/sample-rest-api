package com.kreativsoft.samplerestapi.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    @Column(name="pk_id")
    private int id;
    @Column(name="username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name="email")
    private String email;
    @Column(name = "firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;

}
