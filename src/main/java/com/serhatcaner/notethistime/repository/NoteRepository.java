package com.serhatcaner.notethistime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serhatcaner.notethistime.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{

}
