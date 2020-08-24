package exercise.sink_a_ship;

import java.util.ArrayList;

public class SinkAShip {
    private GameHelper helper = new GameHelper();
    private ArrayList<Ship> shipList = new ArrayList<Ship>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        Ship one = new Ship();
        one.setName("Darius");
        Ship two = new Ship();
        two.setName("Gang Plank");
        Ship three = new Ship();
        three.setName("Katarina");

        shipList.add(one);
        shipList.add(two);
        shipList.add(three);

        for (Ship shipSet : shipList) {
            ArrayList<String> newLocation = helper.placeShip(3);
            shipSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!shipList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (Ship shipToTest : shipList) {
            result = shipToTest.check(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                shipList.remove(shipToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Your goal is " + numOfGuesses);
    }

    public static void main(String[] args) {
        SinkAShip game = new SinkAShip();
        game.setUpGame();
        game.startPlaying();
    }

}
