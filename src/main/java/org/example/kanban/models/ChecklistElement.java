package org.example.kanban.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="checklistElements")
public class ChecklistElement {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Boolean isCompleted;
    private Date dueDate;
    @ManyToOne
    private Checklist checklist;
}
