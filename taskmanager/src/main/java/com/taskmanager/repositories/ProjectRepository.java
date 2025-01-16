package com.taskmanager.repositories;

import com.taskmanager.model.Project;
import com.taskmanager.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
