package service;

import model.Quiz;
import service.IQuizParser;

public class VerbsParser implements IQuizParser {

    @Override
    public Quiz parse(String line) {
        String[] cols = line.split(",", 4);
        if (cols.length != 4)
            throw new RuntimeException("Line must contains 4 fields: " + line);
        return new Quiz(cols[3],
                cols[0] + " " + cols[1] + " " + cols[2]);
    }
}
