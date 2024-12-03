package org.example.kanban.models;

import jakarta.persistence.*;

@Entity
@Table(name="kanbanLists")
public class KanbanList {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToOne
    private Board board;
}
