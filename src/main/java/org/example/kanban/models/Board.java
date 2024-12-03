package org.example.kanban.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="boards")
public class Board {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name = name;
    }
}
