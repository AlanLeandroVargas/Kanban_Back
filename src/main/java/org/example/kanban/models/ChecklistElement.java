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
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Boolean getIsCompleted(){
        return isCompleted;
    }
    public void setIsCompleted(Boolean isCompleted){
        this.isCompleted = isCompleted;
    }
    public Date getDueDate(){
        return dueDate;
    }
    public void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }
}
