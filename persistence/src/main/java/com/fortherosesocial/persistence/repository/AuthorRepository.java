package com.fortherosesocial.persistence.repository;

import com.fortherosesocial.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
