package org.example.kanban.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    @ManyToOne
    private ChecklistElement checklistElement;
    @ManyToOne
    private Log log;
    @ManyToOne
    private Comment comment;
    @ManyToOne
    private Board board;
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
