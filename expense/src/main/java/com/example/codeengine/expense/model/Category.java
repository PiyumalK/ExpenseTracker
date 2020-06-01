package com.example.codeengine.expense.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name="category")
public class Category {

    @Id
    private Long id;

    @NonNull
    private String name;
}
