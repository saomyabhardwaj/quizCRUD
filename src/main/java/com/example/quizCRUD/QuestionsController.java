package com.example.quizCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questions")
public class QuestionsController {
    @Autowired
    private QuestionRepository questionRepository;
    @GetMapping("/")
    public List<Questions> getAllQuestions()
    {
        return(List<Questions>) questionRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Questions> getQuestionById(@PathVariable Long id)
    {
        return questionRepository.findById(id);
    }

    @PostMapping("/")
    public Questions createQuestions(@RequestBody Questions questions)
    {
        return questionRepository.save(questions);
    }
    @PutMapping("/{id}")
    public Questions updateQuestion(@PathVariable Long id, @RequestBody Questions updatedQuestions)
    {
        Optional<Questions> questionsOptional=questionRepository.findById(id);
        if(questionsOptional.isPresent())
        {
                Questions questions=questionsOptional.get();
                questions.setQuestionText(updatedQuestions.getQuestionText());
                questions.setOption1(updatedQuestions.getOption1());
                questions.setOption2(updatedQuestions.getOption2());
                questions.setOption3(updatedQuestions.getOption3());
                questions.setOption4(updatedQuestions.getOption4());
                questions.setCorrectOption(updatedQuestions.getCorrectOption());
                return questionRepository.save(questions);
        }
        else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteQuestions(@PathVariable Long id)
    {
        questionRepository.deleteById(id);
    }
}
