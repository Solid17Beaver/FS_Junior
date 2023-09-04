package com.kidball.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity// указывает, что класс Income является сущностью (entity) в контексте базы данных.
public class Income {
    @Setter(AccessLevel.NONE)
    @Id//определяет что поле id является первичным ключом и его значения будут автоматически генерироваться базой данных
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)//указывает, что поле id не может быть пустым
    private Long id;
    private int income;

    public Income() {
        this.income = 0;
    }
}
