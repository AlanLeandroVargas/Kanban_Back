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
    private List<String> tags;
    @ManyToOne
    private KanbanList kanbanList;
}
