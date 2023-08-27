package Assignments.GuessTheNumber;

public class testmain {
    public static void main(String[] args) {

        Game game = new Game();

        System.out.println("This is a Cheat Sheet, this is the correct number : " + game.getComputerNumber());

        game.takeUserInput();
        while(!game.isCorrectNumber()){

            System.out.println("You have entered wrong number. Please Try again!!");
            game.takeUserInput();

        }
        System.out.println("You won and you took " + game.getNo_of_guesses() + " guesses.");

    }
}
