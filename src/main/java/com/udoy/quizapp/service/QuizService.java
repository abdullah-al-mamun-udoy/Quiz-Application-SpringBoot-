package com.udoy.quizapp.service;

import com.udoy.quizapp.model.Question;
import com.udoy.quizapp.model.Quiz;
import com.udoy.quizapp.dao.QuestionDao;
import com.udoy.quizapp.dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Question> questions = questionDao.getQuestionByCategoryWise(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);

        return new ResponseEntity<>("success save", HttpStatus.OK);

    }
}
