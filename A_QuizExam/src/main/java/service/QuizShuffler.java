package service;

import model.Quiz;
import java.util.Collections;
import java.util.List;

public class QuizShuffler {
    private final QuizStorage storage;

    public QuizShuffler(QuizStorage storage) {
        this.storage = storage;
    }

    List<Quiz> getRandomQuizList(int count) {
        List<Quiz> list = storage.getQuizList();
        if (count > list.size())
            count = list.size();
        Collections.shuffle(list);
        return list.subList(0, count);
    }

}
