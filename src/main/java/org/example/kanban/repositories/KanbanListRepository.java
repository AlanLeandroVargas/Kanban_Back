package org.example.kanban.repositories;

import org.example.kanban.models.KanbanList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KanbanListRepository extends JpaRepository<KanbanList, Integer> {
}
