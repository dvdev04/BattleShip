import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private ArrayList<Integer> battlefield;
    private int[] shipOneWhole;
    private int[] shipTwoWhole;
    private int shipOneCoordinate;
    private int shipTwoCoordinate;
    private int player1Health;
    private int player2Health;


    Scanner scanner = new Scanner(System.in);


    public Game(Player player1, Player player2) {
        // Create new battlefield
        Ocean ocean = new Ocean(10);
        battlefield = ocean.getBattlefield();

        // Initialize battlefield
        for(int i = 0; i < ocean.getWidth(); i++) {
            battlefield.add(0);
        }

        // Creat Ships for each player
        Ship shipOne = new Ship(3, ocean.getWidth());
        Ship shipTwo = new Ship(3, ocean.getWidth());

        // generate starting coordinates for each ship
        Random random = new Random();
        shipOneCoordinate = random.nextInt(ocean.getWidth()/2);
        shipTwoCoordinate = random.nextInt(ocean.getWidth()/2) + ocean.getWidth()/2;

        // set full coordinates for both ships
        for(int i = shipOneCoordinate; i < shipOneCoordinate + shipOne.size; i++) {
            battlefield.set(i, 1);
        }
        for(int i = shipTwoCoordinate; i < shipTwoCoordinate + shipTwo.size; i++) {
            battlefield.set(i, 2);
        }

        // start the game, set the health bar, start getting inputs from the user
        player1Health = shipOne.size;
        player2Health = shipTwo.size;

        // Show coordinates of each ships
        shipOneWhole = new int[shipOne.size];
        shipTwoWhole = new int[shipTwo.size];

       // for(int i = 0; i < ocean.getWidth(); i++) {
         //   if (battlefield.get(i) == 1) {


          //  } else-if (battlefield.get(i) == 2) {

           // }
       // }
        //System.out.println();



    }



    public void startGame() {

        while (player1Health != 0 || player2Health != 0 ) {




        }


    }

    public void restartGame() {
        Scanner scanner = new Scanner(System.in);

    }







    public int getShipOneCoordinate() {
        return shipOneCoordinate;
    }

    public int getShipTwoCoordinate() {
        return shipTwoCoordinate;
    }

    public ArrayList getBattlefield() {
        return battlefield;
    }
}

