package com.example.quizCRUD;

import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Questions, Long> {
}
