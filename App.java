import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class App {
    private List<Player> players;
    private int rounds;
    private int currentTurn;

    public App(int numberOfPlayers) {
        players = new ArrayList<>();
        // Initialize players
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player("Player " + (i + 1)));
        }
    }

    public void startGame() {
        System.out.println("Game started!");
        // Logic for starting the game
    }

    public void playRound() {
        // Logic for each round of the game
    }

    // Main method to run the game
    public static void main(String[] args) {
        // For example, setting the number of players to 2
        App game = new App(2);
        game.startGame();
    }
}

class Player {
    private String name;
    private ScoreCard scoreCard;

    public Player(String name) {
        this.name = name;
        this.scoreCard = new ScoreCard();
    }

    public void rollDice() {
        // Logic for rolling the dice
    }

    public void chooseCategory() {
        // Logic for choosing the scoring category
    }

    public String getName() {
        return name;
    }

    public ScoreCard getScoreCard() {
        return scoreCard;
    }
}

class Dice {
    private int[] dice;
    private static final int NUMBER_OF_DICE = 5;

    public Dice() {
        dice = new int[NUMBER_OF_DICE];
    }

    public void roll() {
        // Logic to roll the dice
    }

    public int[] getDiceValues() {
        return dice;
    }
}

class ScoreCard {
    // Define score categories
}

class Category {
    private String categoryType;
    private int score;

    public Category(String categoryType) {
        this.categoryType = categoryType;
        this.score = -1; // Score is initially unassigned
    }

    public String getCategoryType() {
        return categoryType;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
