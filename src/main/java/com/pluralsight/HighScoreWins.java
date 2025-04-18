package com.pluralsight;

import java.util.*;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a score: ");
        String input = scanner.nextLine();

        String[] parts = input.split("\\|");

        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        String homeTeam = teams[0];
        String visitorTeam = teams[1];
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        String winner = homeScore > visitorScore ? homeTeam : visitorTeam;

        System.out.println("Winner: " + winner);

        scanner.close();
    }
}
