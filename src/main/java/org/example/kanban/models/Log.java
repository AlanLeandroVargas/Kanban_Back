package org.example.kanban.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="logs")
public class Log {

    @Id
    @GeneratedValue
    private Integer id;
    private Date date;
    private String description;
    @ManyToOne
    private KanbanList kanbanList;
}
