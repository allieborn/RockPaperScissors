import java.util.Scanner;
import java.util.Random;

public class MainApp {

    public static void main(String[] args) {

        Rock rock = new Rock();
        Robo mrRobot = new Robo();
        User newUser = new User();
        WhoWins winner = new WhoWins();
        Scanner scan = new Scanner(System.in);
        String myNameIs;
        String userChoice = "paper";
        String chosenOpponent;
        String roboResult;
        String keepGoing = "yes";
        //boolean properMove = true;

        System.out.println("Welcome to Rock/Paper/Scissors!");
        System.out.println("Here are your opponents: ");
        rock.name("Rock");
        mrRobot.name("Mr. Robot");
        System.out.println();

        System.out.println("Please enter your name: ");
        myNameIs = scan.nextLine();
        newUser.name(myNameIs);

        do {

            System.out.println("Enter whom you would like to play against: ");
            chosenOpponent = scan.nextLine();

            if (chosenOpponent.equalsIgnoreCase("Rock")) {
                System.out.println(myNameIs + ", enter your move now: ");
                userChoice = scan.nextLine();
                userChoice.toLowerCase();
                System.out.println("Rock's result: ");
                rock.result();
                winner.getResultForUservRock(userChoice, myNameIs);
            } else if (chosenOpponent.equalsIgnoreCase("Mr. Robot")) {
                System.out.println(myNameIs + ", enter your move now: ");
                userChoice = scan.nextLine();
                userChoice.toLowerCase();
                System.out.println("Mr. Robot's result: ");
                roboResult = (mrRobot.result2());
                System.out.println(roboResult);
                winner.getResultForUserVRobo(userChoice, roboResult, myNameIs, "Mr. Robot"); //CAN NOT READ ROBORESULT...
                System.out.println(winner.getResultForUserVRobo2(userChoice, roboResult, myNameIs, "Mr. Robot")); //READS BUT ONLY RETURNS
                                                                                                                             //DEFAULT RETURN STATEMENT
//                winner.getResultForUserVRobo("rock", "rock", "GB", "Mr. Robot"); //THIS WORKS
//                winner.getResultForUserVRobo("rock", "rock", myNameIs, "Mr. Robot"); //THIS WORKS
//                winner.getResultForUserVRobo(userChoice, "rock", myNameIs, "Mr. Robot"); //THIS WORKS
            } else {
                System.out.println("You did not enter a valid opponent");
                keepGoing = "yes";
            }

            System.out.println("Would you like to play again? Enter 'yes' or 'no': ");
            keepGoing = scan.nextLine();

        } while (keepGoing.equalsIgnoreCase("yes"));
        System.out.println("Goodbye. ");
    }

}