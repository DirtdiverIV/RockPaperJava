package com.factoriaf5.rps.models;
import com.factoriaf5.rps.application.GameOption;

public class Spock implements GameOption{

    @Override
    public String getName() {
        return "Spock";
    }

    @Override
    public boolean beats(GameOption other) {
        return other instanceof Scissors || other instanceof Rock;
    }
}
