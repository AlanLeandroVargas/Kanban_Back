package org.example.kanban.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="tags")
public class Tag {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToMany
    @JoinTable(
            name="tag_cards",
            joinColumns = @JoinColumn(name = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id")
    )
    private List<Card> cards;
}
