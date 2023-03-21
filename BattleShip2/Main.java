import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Intro
        System.out.println("Welcome! This is JavaGrindr's BattleShip!\nEnter your names!\n");
        System.out.println("Player One: ");
        Player one = new Player(scanner.nextLine());
        System.out.println("Player Two: ");
        Player two = new Player(scanner.nextLine());
        System.out.printf("Welcome! %s and %s!\nBattle's on!", one.getName(), two.getName());

        // Battle starts
        Game game = new Game(one, two);
        System.out.println(game.getShipOneCoordinate());
        System.out.println(game.getShipTwoCoordinate());

        System.out.println(game.getBattlefield());


    }
}
