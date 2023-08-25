package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final GameOption[] options = { new Rock(), new Paper(), new Scissors(), new Lizard(), new Spock() };
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public void play() {
        while (true) {
            GameOption userOption = getUserOption();
            GameOption computerOption = options[random.nextInt(options.length)];

            System.out.println("You chose: " + userOption.getName());
            System.out.println("Computer chose: " + computerOption.getName());

            if (userOption.beats(computerOption)) {
                System.out.println("You win!");
            } else if (computerOption.beats(userOption)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("It's a draw!");
            }

            System.out.println("Starting a new game...\n");
        }
    }

    private GameOption getUserOption() {
        System.out.println("Enter your choice: 0 Rock | 1 Paper | 2 Scissors | 3 Lizard | 4 Spock");
        int userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice >= options.length) {
            System.out.println("Invalid choice. Please choose a valid option.");
            return getUserOption();
        }

        return options[userChoice];
    }
}
