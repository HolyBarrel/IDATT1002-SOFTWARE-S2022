package edu.ntnu.idatt1002.k01g08.fta.objects;

/**
 * Represents a football player.
 * @author Bendik M. Engen
 * @version 2022-03-21
 */
public class Player {
    final private String name;
    final private int number;
    private int redCards = 0;
    private int yellowCards = 0;
    private int goals = 0;
    private int assists = 0;

    /**
     * Creates a player instance.
     * @param name the name of the player
     * @param number the squad number of the player
     */
    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    /**
     * Returns the name of this player
     * @return the name of this player
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the squad number of this player
     * @return the squad number of this player
     */
    public int getNumber() {
        return number;
    }

    /**
     * Returns the number of red cards for this player
     * @return the number of red cards for this player
     */
    public int getRedCards() {
        return redCards;
    }

    /**
     * Returns the number of yellow cards for this player
     * @return the number of yellow cards for this player
     */
    public int getYellowCards() {
        return yellowCards;
    }

    /**
     * Returns the number of scored goals for this player
     * @return the number of scored goals for this player
     */
    public int getGoals() {
        return goals;
    }

    /**
     * Returns the number of assists for this player
     * @return the number of assists for this player
     */
    public int getAssists() {
        return assists;
    }

    /**
     * Increments this player's number of red cards
     */
    public void increaseRedCards() {
        redCards++;
    }

    /**
     * Increases this player's number of red cards.
     * @param number the number to increase this player's red cards by
     */
    public void increaseRedCards(int number) {
        redCards += number;
    }

    /**
     * Increments this player's number of yellow cards
     */
    public void increaseYellowCards() {
        yellowCards++;
    }

    /**
     * Increases this player's number of yellow cards.
     * @param number the number to increase this player's yellow cards by
     */
    public void increaseYellowCards(int number) {
        yellowCards += number;
    }

    /**
     * Increments this player's number of scored goals
     */
    public void increaseGoals() {
        goals++;
    }

    /**
     * Increases this player's number of scored goals.
     * @param number the number to increase this player's goals by
     */
    public void increaseGoals(int number) {
        goals += number;
    }

    /**
     * Increments this player's number of assists
     */
    public void increaseAssists() {
        assists++;
    }

    /**
     * Increases this player's number of assists.
     * @param number the number to increase this player's assists by
     */
    public void increaseAssists(int number) {
        assists += number;
    }

    @Override
    public String toString() {
        return '(' + name + ' ' + number +
                ": " + redCards +
                " red, " + yellowCards +
                " yellow, " + goals +
                " goals, " + assists +
                " assists)";
    }
}
