package com.factoriaf5.rps.models;
import com.factoriaf5.rps.application.GameOption;

public class Lizard implements GameOption{
    @Override
    public String getName() {
        return "Lizard";
    }

    @Override
    public boolean beats(GameOption other) {
        return other instanceof Paper || other instanceof Spock;
    }

}
