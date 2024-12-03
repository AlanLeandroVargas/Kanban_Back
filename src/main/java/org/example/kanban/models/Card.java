package org.example.kanban.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="cards")
public class Card {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    @ManyToOne
    private KanbanList kanbanList;
    @ManyToMany(mappedBy = "cards")
    private List<Tag> tags;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
