package service;

import model.Quiz;

public interface IQuizParser {
    Quiz parse(String line);
}
