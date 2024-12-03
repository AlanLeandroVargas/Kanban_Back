package org.example.kanban.repositories;

import org.example.kanban.models.ChecklistElement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistElementRepository extends JpaRepository<ChecklistElement, Integer> {
}
