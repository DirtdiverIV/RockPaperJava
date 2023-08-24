package com.factoriaf5.rps.application;

public interface GameOption {
    String getName();
    boolean beats(GameOption other);
}
