package org.example.kanban.models;

import jakarta.persistence.*;

@Entity
@Table(name="checklists")
public class Checklist {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    @ManyToOne
    private Card card;
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
