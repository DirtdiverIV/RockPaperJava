package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final GameOption[] options = { new Rock(), new Paper(), new Scissors() };
    private final Random random = new Random();

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your election: 0 Rock| 1 Paper | 2 Scissors ");
        int userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice >= options.length) {
            System.out.println("Bad election. Restart the game");
            return;
        }

        GameOption userOption = options[userChoice];
        GameOption computerOption = options[random.nextInt(options.length)];

        System.out.println("You choose: " + userOption.getName());
        System.out.println("TARS choose: " + computerOption.getName());

        if (userOption.beats(computerOption)) {
            System.out.println("                                                  \n" +
                    "██    ██  ██████  ██    ██     ██     ██ ██ ███    ██ \n" +
                    " ██  ██  ██    ██ ██    ██     ██     ██ ██ ████   ██ \n" +
                    "  ████   ██    ██ ██    ██     ██  █  ██ ██ ██ ██  ██ \n" +
                    "   ██    ██    ██ ██    ██     ██ ███ ██ ██ ██  ██ ██ \n" +
                    "   ██     ██████   ██████       ███ ███  ██ ██   ████ \n" +
                    "                                                      \n" +
                    "                                                      ");
        } else if (computerOption.beats(userOption)) {
            System.out.println("                                                  \n" +
                    "██    ██  ██████  ██    ██     ██       ██████   ██████  ███████ ███████ \n" +
                    " ██  ██  ██    ██ ██    ██     ██      ██    ██ ██    ██ ██      ██      \n" +
                    "  ████   ██    ██ ██    ██     ██      ██    ██ ██    ██ ███████ █████   \n" +
                    "   ██    ██    ██ ██    ██     ██      ██    ██ ██    ██      ██ ██      \n" +
                    "   ██     ██████   ██████      ███████  ██████   ██████  ███████ ███████ \n" +
                    "                                                                         \n" +
                    "                                                                         ");
        } else {
            System.out.println("                                                  \n" +
                    "██ ████████ ███████      █████      ██████  ██████   █████  ██     ██ ██ \n" +
                    "██    ██    ██          ██   ██     ██   ██ ██   ██ ██   ██ ██     ██ ██ \n" +
                    "██    ██    ███████     ███████     ██   ██ ██████  ███████ ██  █  ██ ██ \n" +
                    "██    ██         ██     ██   ██     ██   ██ ██   ██ ██   ██ ██ ███ ██    \n" +
                    "██    ██    ███████     ██   ██     ██████  ██   ██ ██   ██  ███ ███  ██ \n" +
                    "                                                                         \n" +
                    "                                                                         ");
        }
    }
}
