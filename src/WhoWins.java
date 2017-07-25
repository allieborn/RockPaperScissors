public class WhoWins {

    public void getResultForUservRock(String result1, String myNameIs) {  //THIS IS FOR USER V ROCK RESULTS ONLY
        if (result1.equalsIgnoreCase("rock")) {
            System.out.println("This game was a draw.");
        } else if (result1.equalsIgnoreCase("paper")) {
            System.out.println(myNameIs + " wins!");
        } else if (result1.equalsIgnoreCase("scissors")) {
            System.out.println("Rock wins!");
        }
    }

    public void getResultForUserVRobo(String result1, String result2, String myNameIs, String roboName) {
        if (result1.equalsIgnoreCase("rock") && result2.equalsIgnoreCase("rock")) {
            System.out.println("This game was a draw.");
        } else if (result1.equalsIgnoreCase("paper") && result2.equalsIgnoreCase("rock")) {
            System.out.println(myNameIs + " wins!");
        } else if (result1.equalsIgnoreCase("scissors") && result2.equalsIgnoreCase("rock")) {
            System.out.println(roboName + " wins!");
        } else if (result1.equalsIgnoreCase("rock") && result2.equalsIgnoreCase("paper")) {
            System.out.println(roboName + " wins!");
        } else if (result1.equalsIgnoreCase("paper") && result2.equalsIgnoreCase("paper")) {
            System.out.println("This game was a draw.");
        } else if (result1.equalsIgnoreCase("scissors") && result2.equalsIgnoreCase("paper")) {
            System.out.println(myNameIs + " wins!");
        } else if (result1.equalsIgnoreCase("rock") && result2.equalsIgnoreCase("scissors")) {
            System.out.println(myNameIs + " wins!");
        } else if (result1.equalsIgnoreCase("paper") && result2.equalsIgnoreCase("scissor")) {
            System.out.println(roboName + " wins!");
        } else if (result1.equalsIgnoreCase("scissors") && result2.equalsIgnoreCase("scissors")) {
            System.out.println("This game was a draw. ");
        }
    }

    public String getResultForUserVRobo2(String result1, String result2, String myNameIs, String roboName) {
        String whoWonUservRobo;
        if (result1.equalsIgnoreCase("rock") && result2.equalsIgnoreCase("rock")) {
            whoWonUservRobo = "This game was a draw.";
        } else if (result1.equalsIgnoreCase("paper") && result2.equalsIgnoreCase("rock")) {
            whoWonUservRobo = myNameIs + " wins!";
        } else if (result1.equalsIgnoreCase("scissors") && result2.equalsIgnoreCase("rock")) {
            whoWonUservRobo = roboName + " wins!";
        } else if (result1.equalsIgnoreCase("rock") && result2.equalsIgnoreCase("paper")) {
            whoWonUservRobo = roboName + " wins!";
        } else if (result1.equalsIgnoreCase("paper") && result2.equalsIgnoreCase("paper")) {
            whoWonUservRobo = "This game was a draw.";
        } else if (result1.equalsIgnoreCase("scissors") && result2.equalsIgnoreCase("paper")) {
            whoWonUservRobo = myNameIs + " wins!";
        } else if (result1.equalsIgnoreCase("rock") && result2.equalsIgnoreCase("scissors")) {
            whoWonUservRobo = myNameIs + " wins!";
        } else if (result1.equalsIgnoreCase("paper") && result2.equalsIgnoreCase("scissor")) {
            whoWonUservRobo = roboName + " wins!";
        } else if (result1.equalsIgnoreCase("scissors") && result2.equalsIgnoreCase("scissors")) {
            whoWonUservRobo = "This game was a draw.";
        } else whoWonUservRobo = "I HAVE NO IDEA WHO WON.";
        return whoWonUservRobo;
        //IF USING THE STRING RETURN METHOD, I CAN'T MAKE IT WORK IN THE MAIN
    }


}







