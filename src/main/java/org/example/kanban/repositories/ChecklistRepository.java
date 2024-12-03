package org.example.kanban.repositories;

import org.example.kanban.models.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistRepository extends JpaRepository<Checklist, Integer> {
}
