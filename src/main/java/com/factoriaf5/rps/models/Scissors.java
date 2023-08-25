package com.factoriaf5.rps.models;
import com.factoriaf5.rps.application.GameOption;

public class Scissors implements GameOption {
    @Override
    public String getName() {
        return "Scissors";
    }

    @Override
    public boolean beats(GameOption other) {
        return other instanceof Paper || other instanceof Lizard;
    }
}
