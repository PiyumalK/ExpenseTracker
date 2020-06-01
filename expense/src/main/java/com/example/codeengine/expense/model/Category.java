package com.example.codeengine.expense.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name="category")
public class Category {

    @Id
    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;
}
