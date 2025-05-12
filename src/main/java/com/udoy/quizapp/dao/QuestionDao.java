package com.udoy.quizapp.dao;

import com.udoy.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionDao extends JpaRepository<Question, Integer> {



}
