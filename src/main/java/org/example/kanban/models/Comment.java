package org.example.kanban.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue
    private Integer id;
    private String comment;
    private Date date;
    @ManyToOne
    private Card card;
    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
}
