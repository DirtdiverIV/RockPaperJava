package com.factoriaf5.rps.models;
import com.factoriaf5.rps.application.GameOption;

public class Paper implements GameOption {
    @Override
    public String getName() {
        return "Paper";
    }

    @Override
    public boolean beats(GameOption other) {
        return other instanceof Rock || other instanceof Spock;
    }
}
