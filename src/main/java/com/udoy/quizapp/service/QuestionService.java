package com.udoy.quizapp.service;


import com.udoy.quizapp.Question;
import com.udoy.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;


    public List<Question> getAllQuestions() {
       return questionDao.findAll();
    }
}
