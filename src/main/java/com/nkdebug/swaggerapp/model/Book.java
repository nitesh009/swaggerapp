package com.nkdebug.swaggerapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="book")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book implements Serializable {

    @Id
    @GeneratedValue
    private int bookId;
    private String bookName;
    private double price;

}
